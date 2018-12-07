package com.comp.cafe.priceservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController - Tells Spring Boot you’re going to expose the code in this
 * class as a Spring RestController class
 */
@RestController
public class PriceController {

	@Autowired
	ItemPriceJpaRepository itemPriceJpaRepository;

	/*
	 * All URLs exposed in this application will be prefaced with /api/price prefix.
	 */
	@RequestMapping("/api/price/{itemNumber}")
	public Long byNumber(@PathVariable("itemNumber") String itemNumber) {
		Optional<ItemPrice> optional = itemPriceJpaRepository.findById(new Integer(itemNumber));
		return optional.get().getPrice();
	}
}
