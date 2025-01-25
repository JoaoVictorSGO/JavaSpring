package com.devsuperior.exerciciojava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.exerciciojava.entities.Order;
import com.devsuperior.exerciciojava.services.OrderService;

@SpringBootApplication
public class ExerciciojavaApplication implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExerciciojavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order1 = new Order(1034,150.00, 0.2);
		Order order2 = new Order(2282,800.00,0.1);
		Order order3 = new Order(1309,95.90, 0.0);
		
		System.out.println("\nPedido código: " + order1.getCode() +
				"\nValor total: " + orderService.total(order1) + "\n");
		System.out.println("Pedido código: " + order2.getCode() +
				"\nValor total: " + orderService.total(order2) + "\n");
		System.out.println("Pedido código: " + order3.getCode() +
				"\nValor total: " + orderService.total(order3) + "\n");
		
	}

}
