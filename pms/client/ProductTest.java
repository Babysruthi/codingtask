package com.pms.client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.pms.dto.Product;
import com.pms.exception.InvalidProductIDxception;
import com.pms.service.ProductService;
import com.pms.service.ProductServiceImpl;
public class ProductTest 
{

	public static void main(String[] args) throws InvalidProductIDxception
	{
		//List<Product>plist=new ArrayList<Product>();
		Map<Integer,Product> pmap=new HashMap<Integer,Product>();
		System.out.println("enter product details");
		Scanner sc=new Scanner(System.in);
		int pid=0;
		String name=null;
		// reading  product objects list
		for(int i=0;i<3;i++)
		{
			pid=sc.nextInt();
			sc.nextLine();
			name=sc.nextLine();
			Product p=new Product();//static 
			p.setId(pid);
			p.setName(name);   //dynamics
			pmap.put(pid,p);
		}
		
		ProductService ps =new ProductServiceImpl();
	
		int n;
		//n=sc.nextInt();
		boolean s=true;
		while(s)
		{
			n=sc.nextInt();
		switch(n){
			case 1:
			{
				System.out.println("Enter product details");
				Product p=new Product();
				p.id=sc.nextInt();
				sc.nextLine();
				p.name=sc.nextLine();
				Map<Integer,Product> k=ps.addProduct(p);
				pmap.putAll(k);
				System.out.println("The product details are added");
				break;
			}
			case 2:
			{
				System.out.println("The product details are:");
				ps.printProduct(pmap);
				break;
			}
			case 3:
			{
				boolean result= ps.validateAllProducts(pmap);
				if(result==false)
				{
					throw new InvalidProductIDxception("Invalid  product id");
				}
				System.out.println("Final result is :"+result );
				break;
			}
			case 4:
			{
				System.out.println("Enter the product id to remove the product:");
				int p=sc.nextInt();
				Map<Integer,Product> pmap1=ps.deleteProduct(p, pmap);
				System.out.println("product with id "+p+" is removed");
				pmap=pmap1;
				break;
				
			}
			case 5:
				break;
		
		}	
		}
	}
}


