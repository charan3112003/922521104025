package com.ecommerce.affordmed.ecommerce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EcommerceService {

	public List<Ecommerce> ecom=new ArrayList<>(Arrays.asList(new Ecommerce("Laptop 1","2236","4.7","63","yes"),
			new Ecommerce("Laptop 13","1244","4.5","45","out-of-stock"),
			new Ecommerce("Laptop 3","9102","4.44","98","out-of-stock"),
			new Ecommerce("Laptop 11","2652","4.12","70","yes"),
			new Ecommerce("Laptop 4","1258","3.8","33","yes"),
			new Ecommerce("Laptop 13","8686","3.22","24","out-of-stock"),
			new Ecommerce("Laptop 14","9254","3","56","yes"),
			new Ecommerce("Laptop 1","1059","2.77","21","yes"),
			new Ecommerce("Laptop 10","7145","2.74","15","yes"),
			new Ecommerce("Laptop 15","4101","2.67","37","out-of-stock")));


public List<Ecommerce> getAllEcommerce(){
	return ecom;
}

public Ecommerce getEcommerce(String productName) {
	return ecom.stream().filter(t->t.getProductName().equals(productName)).findFirst().get();
}
public void addEcommerce(Ecommerce ecommerce) {
	ecom.add(ecommerce);
}
public void updateEcommerce(Ecommerce ecommerce,String productName) {
	for(int i=0;i<ecom.size();i++) {
		Ecommerce eco =ecom.get(i);
		if(eco.getProductName().equals(productName)) {
			ecom.set(i,ecommerce);
			return;
		}
	}
}
}