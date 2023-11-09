package com.medicine.service;
import java.util.List;

import com.medicine.entity.DeliveryBoy;

public interface DeliveryBoyService {
	List<DeliveryBoy> getAllRecords();
	
	DeliveryBoy saveDeliveryBoy(DeliveryBoy deliveryboy);
	
	DeliveryBoy getDeliveryBoy(String id);
	
	DeliveryBoy updateDeliveryBoy(DeliveryBoy deliveryboy);
	
	void deleteDeliveryBoy(String id);


}
