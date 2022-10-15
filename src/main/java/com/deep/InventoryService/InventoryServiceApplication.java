package com.deep.InventoryService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.deep.InventoryService.model.Inventory;
import com.deep.InventoryService.repository.InventoryRepository;

@SpringBootApplication
@EnableEurekaClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
//		return args->{
//			Inventory inventory=new Inventory();
//			inventory.setSkuCode("iphone-13");
//			inventory.setQuantity(100);	
//			
//			Inventory inventory1=new Inventory();
//			inventory.setSkuCode("iphone-13_red");
//			inventory.setQuantity(10);	
//			
//			
//			Inventory inventory2=new Inventory();
//			inventory.setSkuCode("iphone-13_blue");
//			inventory.setQuantity(10);
//			
//			inventoryRepository.save(inventory);
//			inventoryRepository.save(inventory1);
//			inventoryRepository.save(inventory2);
//		};
//	}

}
