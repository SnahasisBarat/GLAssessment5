package com.example.demo;
import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;

@RestController
public class CustomerController {

	private List<Customer> customers = createList();

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<Customer> firstPage() {
		
		return customers;
	}

	
	
	
	
	@DeleteMapping( "/customers/{id}" )
	public Customer delete(@PathVariable("id") String id) {
		System.out.println("Deleted id"+id);
		Customer deletedCus = null;
		System.out.println(customers);
		for (Customer cus : customers) {
			
			if (cus.getCusId().equals(id)) {
				
				System.out.println(customers.size());
				customers.remove(cus);
				System.out.println(customers.size());
				deletedCus = cus;
				break;
			}
		}
		return deletedCus;
	}

	@PostMapping
	public Customer create(@RequestBody Customer user) {
		
		customers.add(user);
		
		return user;
	}
	
	
	private static List<Customer> createList() {
		List<Customer> tempCustomers = new ArrayList<>();
		Customer cu1 = new Customer();
		cu1.setName("customer1");
		cu1.setPhone("12345676");
		cu1.setCusId("1");
		

		Customer cu2=new Customer();
		cu2.setName("customer2");
		cu2.setPhone("82372395");
		cu2.setCusId("2");
		
		tempCustomers.add(cu1);
		tempCustomers.add(cu2);
		return tempCustomers;
	}
}
