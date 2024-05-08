package com.ecommerce.affordmed.ecommerce;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcommerceController {
	
	@Autowired
	EcommerceService ec;
	
	@RequestMapping("/getall")
	public List<Ecommerce> getAllEcommerce(){
		return ec.getAllEcommerce();
		
	}
	
	@RequestMapping("/getall/{productName}")
	public Ecommerce getEcommerce(@PathVariable String productName) {
		return ec.getEcommerce(productName);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/getall")
	public void addEcommerce(@RequestBody Ecommerce ecommerce) {
		ec.addEcommerce(ecommerce);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/getall/{productname}")
	public void updateEcommerce(@RequestBody Ecommerce ecommerce,@PathVariable String productName) {
		ec.updateEcommerce(ecommerce, productName);
	}
		
	

}
