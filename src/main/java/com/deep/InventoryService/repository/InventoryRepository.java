package com.deep.InventoryService.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deep.InventoryService.model.Inventory;

@Repository
public interface InventoryRepository  extends JpaRepository<Inventory, Long>{
	
	List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
