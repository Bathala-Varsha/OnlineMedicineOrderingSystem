package com.medicine.controller;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicine.entity.DeliveryBoy;
import com.medicine.repository.DeliveryBoyRepository;
import com.medicine.serviceimpl.DeliveryBoyServiceImpl;
@RestController
@RequestMapping("/onlineMedicine")
public class Controller {
	@Autowired
    DeliveryBoyServiceImpl deliveryboyserviceimpl;
	@Autowired
	DeliveryBoyRepository deliveryboyRepository;
	
	
	
	@GetMapping("/deliveryboy")
	public ResponseEntity<List<DeliveryBoy>>getAllDeliveryBoys()
	{
		List<DeliveryBoy> newdeliveryboy=deliveryboyserviceimpl.getAllRecords();
		return new ResponseEntity<>(newdeliveryboy,HttpStatus.OK);
	}
	
	@PostMapping("/deliveryboy")
	public ResponseEntity<DeliveryBoy> addDeliveryBoy(@RequestBody DeliveryBoy deliveryboy) {
		DeliveryBoy newdeliveryboy=deliveryboyserviceimpl.saveDeliveryBoy(deliveryboy);
		return new ResponseEntity<>(newdeliveryboy,HttpStatus.CREATED);
	}
	
	@GetMapping("/deliveryboy/{id}")
	public ResponseEntity<DeliveryBoy> getDeliveryBoyById(@PathVariable String id) {
		Optional<DeliveryBoy> checkdeliveryboy=deliveryboyRepository.findById(id);
		if(checkdeliveryboy.isPresent())
		{
		DeliveryBoy deliveryboy=deliveryboyserviceimpl.getDeliveryBoy(id);
		return new ResponseEntity<>(deliveryboy,HttpStatus.OK);
		}
		else
		{
			System.out.println("this login id is not present");
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
	
	@PutMapping("/deliveryboy/{id}")
	public ResponseEntity<DeliveryBoy> updateDeliveryBoy(@PathVariable String id,@RequestBody DeliveryBoy deliveryboy) {
		Optional<DeliveryBoy> checkdeliveryboy=deliveryboyRepository.findById(id);
		if(checkdeliveryboy.isPresent())
		{
		DeliveryBoy updatedeliveryboy=new DeliveryBoy();
		updatedeliveryboy.setLoginid(deliveryboy.getLoginid());
		updatedeliveryboy.setPassword(deliveryboy.getPassword());
		DeliveryBoy updatedeliveryboynew=deliveryboyserviceimpl.updateDeliveryBoy(deliveryboy);
		return new ResponseEntity<>(updatedeliveryboynew,HttpStatus.OK);
		}
		else
		{
			System.out.println("this login id is not present");
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
	
	@DeleteMapping("/deliveryboy/{id}")
	public ResponseEntity<?> deleteDeliveryBoy(@PathVariable String id)
	{
		Optional<?> checkdeliveryboy=deliveryboyRepository.findById(id);
		if(checkdeliveryboy.isPresent())
		{
		deliveryboyserviceimpl.deleteDeliveryBoy(id);
		return new ResponseEntity<>(HttpStatus.OK);
		}
		else
		{
			System.out.println("this login id is not present");
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	

}
