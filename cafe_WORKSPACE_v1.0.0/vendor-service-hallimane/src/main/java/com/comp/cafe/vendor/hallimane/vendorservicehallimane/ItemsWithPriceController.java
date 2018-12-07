package com.comp.cafe.vendor.hallimane.vendorservicehallimane;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ukilkil
 *
 */

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/rest/hallimane/itemsWithPrice")
public class ItemsWithPriceController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	ItemJpaRepository itemJpaRepository;

	@GetMapping
	public @ResponseBody ResponseEntity<DataWithPrice> getAllItems() {

		List<ItemWithPrice> list = new ArrayList<ItemWithPrice>();
		for (Item i : itemJpaRepository.findAll()) {
			String url = "http://PRICE-SERVICE/api/price/" + i.getId();
			Long price = restTemplate.getForObject(url, Long.class);
			list.add(new ItemWithPrice(i.getName(), price));
		}
		DataWithPrice data = new DataWithPrice();
		data.setData(list);
		data.setCount(list.size());
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
}
