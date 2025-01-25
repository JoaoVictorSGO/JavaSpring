package com.devsuperior.exerciciojava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.exerciciojava.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		System.out.println(shippingService.shipment(order));
		double desconto = order.getBasic() * order.getDiscount();
		return  (order.getBasic() - desconto) + shippingService.shipment(order);
	}
}
