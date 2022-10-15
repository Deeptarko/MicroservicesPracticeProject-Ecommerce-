package com.deep.InventoryService.service;



import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deep.InventoryService.dto.InventoryResponse;
import com.deep.InventoryService.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class InventoryService {
	
	private final InventoryRepository inventoryRepository;
	
	@Transactional(readOnly=true)
	public List<InventoryResponse> isInStock(List<String> skuCode) {
		
		List<InventoryResponse> result= inventoryRepository.findBySkuCodeIn(skuCode).stream()
				.map(inventory->
					InventoryResponse.builder()
									 .skuCode(inventory.getSkuCode())
									 .isInStock(inventory.getQuantity()>0)
									 .build()
					
				).toList();
								
		return result;
	}

}
