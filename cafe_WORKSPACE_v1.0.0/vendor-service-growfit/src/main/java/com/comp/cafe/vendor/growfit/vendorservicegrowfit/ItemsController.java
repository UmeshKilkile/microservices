package com.comp.cafe.vendor.growfit.vendorservicegrowfit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ukilkil
 *
 */

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/rest/growfit/items")
public class ItemsController {

	@Autowired
	ItemJpaRepository itemJpaRepository;

	@GetMapping
	public @ResponseBody ResponseEntity<Data> getAllItems() {
		Data data = new Data();
		data.setData(itemJpaRepository.findAll());
		data.setCount(itemJpaRepository.count());
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
}
