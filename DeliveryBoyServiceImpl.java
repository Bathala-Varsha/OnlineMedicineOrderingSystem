package com.medicine.serviceimpl;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicine.entity.DeliveryBoy;
import com.medicine.service.DeliveryBoyService;
import com.medicine.repository.DeliveryBoyRepository;

@Service
public class DeliveryBoyServiceImpl implements DeliveryBoyService {
	@Autowired
	private DeliveryBoyRepository deliveryboyRepository;

	@Override
	public List<DeliveryBoy> getAllRecords() {
		// TODO Auto-generated method stub
		return deliveryboyRepository.findAll();
	}

	@Override
	public DeliveryBoy saveDeliveryBoy(DeliveryBoy deliveryboy) {
		// TODO Auto-generated method stub
		return deliveryboyRepository.save(deliveryboy);
	}

	@Override
	public DeliveryBoy getDeliveryBoy(String id) {
		// TODO Auto-generated method stub
		return deliveryboyRepository.findById(id).get();
	}

	@Override
	public DeliveryBoy updateDeliveryBoy(DeliveryBoy deliveryboy) {
		// TODO Auto-generated method stub
		return deliveryboyRepository.save(deliveryboy);
	}

	@Override
	public void deleteDeliveryBoy(String id) {
		// TODO Auto-generated method stub
		deliveryboyRepository.deleteById(id);;
		
	}

}
