package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductImp 
{
	double sumOfPrice(ArrayList<Product> productList)
	{
		double sum=0;
		List<Integer>l=new ArrayList<Integer>();
		for(Product p:productList)
		{
			l=Arrays.asList(p.getPrice());
		}
			sum=(double)l.stream().collect(Collectors.summingInt(Integer::intValue));
		return sum;
	}
	
	float maxPrice(ArrayList<Product> productList) 
	{
		
		
		List<Integer>l=new ArrayList<Integer>();
		for(Product p:productList)
		{
			l=Arrays.asList(p.getPrice());
		}
		Optional <Integer> i=l.stream().max(Integer::compare);
		Integer max=i.get();
		return max;
		
	}
	
	float minPrice(ArrayList<Product> productList)
	{
		
		int i;
		List<Integer>l=new ArrayList<Integer>();
		for(Product p:productList)
		{
			l=Arrays.asList(p.getPrice());
		}
		Optional <Integer> i1=l.stream().min(Integer::compare);
		Integer min=i1.get();
		return min;
		
	}
	List<String> getProductNameList(ArrayList<Product> productList) 
	{
		List<String>l=new ArrayList<String>();
		for(Product p:productList)
		{
			l.add(p.getName());
		}
		
		return l;
	}
	public static void main(String[] args) 
	{
		ArrayList plist=new ArrayList<Product>();
		plist.add(new Product(20,"Bag",897));
		plist.add(new Product(21,"Book",87));
		plist.add(new Product(22,"Table",89));
		plist.add(new Product(23,"pen",597));
		
		ProductImplementation pa=new ProductImplementation();
		System.out.println("The product names are "+pa.getProductNameList(plist));
		System.out.println("Sum of products "+pa.sumOfPrice(plist));
		System.out.println("Maximum price of product "+pa.maxPrice(plist));
		System.out.println("Minimum price of product "+pa.minPrice(plist));
		
	}

}
