package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductImplementation 
{
		double sumOfPrice(ArrayList<Product> productList)
		{
			double sum=0;
			for(Product p:productList)
				sum=sum+p.getPrice();
			return sum;
		}
		
		float maxPrice(ArrayList<Product> productList) 
		{
			
			float max;
			int i;
			List<Float>f=new ArrayList<Float>();
			for(Product p:productList)
			{
				f.add((float)p.getPrice());
			}
			max=(float)Collections.max(f);
			return max;
			
		}
		
		float minPrice(ArrayList<Product> productList)
		{
			float min;
			int i;
			List<Float>f=new ArrayList<Float>();
			for(Product p:productList)
			{
				f.add((float)p.getPrice());
			}
			min=Collections.min(f);
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
