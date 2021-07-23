package com.pms.service;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.pms.dto.Product;
import com.pms.exception.InvalidProductIDxception;
public class ProductServiceImpl  implements ProductService{
	
	public Map<Integer,Product> addProduct(Product p) throws InvalidProductIDxception
	{
		boolean flag=false;
		int ct=0;
		Map<Integer,Product> pmap=new HashMap<Integer,Product>();
	   //dynamics
		Product p1=new Product();
		p1.setId(p.id);
		p1.setName(p.name);   //dynamics
		pmap.put(p.id,p1);
		flag=true;
		return pmap;
	}
	public Map<Integer,Product> deleteProduct(int id, Map<Integer,Product> pmap)
	{  
	
		Set s=pmap.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry)i.next();
			if((int)m.getKey()==id)
				i.remove();
		}
		return pmap;
		
	}
//	public List<Product> listAllProduct();
//	public void updateProduct(Product p);
	
	public void printProduct(Map<Integer,Product> pmap)
	{   
		for (Map.Entry<Integer, Product> entry : pmap.entrySet())
		{
		    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
		}
		
	}
	
	
	@Override
	public boolean validateAllProducts(Map<Integer,Product> pmap)
	{   // product id should be 1 to 100
		boolean result=false;
		int count=0;
		Set pset=pmap.entrySet();
		Iterator i=pset.iterator();   // key,proudct
		while(i.hasNext()) {
			Entry e=(Entry)i.next();   // getKey() , getValue() - ---> Object
			
			System.out.println((Product)e.getValue());
			if( (Integer)e.getKey()>=1 && (Integer)e.getKey() <=100)
				count++;
		}
			if(count==pmap.size())
				 result=true;
		
		return result;
	}
}
