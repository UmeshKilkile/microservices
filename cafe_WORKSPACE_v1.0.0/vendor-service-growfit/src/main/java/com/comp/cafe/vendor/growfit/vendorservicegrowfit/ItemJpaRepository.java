package com.comp.cafe.vendor.growfit.vendorservicegrowfit;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ukilkil
 *
 */
public interface ItemJpaRepository extends JpaRepository<Item, Integer> {

	Optional<Item> findById(Integer id);
}
