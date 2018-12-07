package com.comp.cafe.priceservice;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPriceJpaRepository extends JpaRepository<ItemPrice, Integer> {
	Optional<ItemPrice> findById(Integer id);
}
