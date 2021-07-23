package Stringmanipul;
import java.lang.*;
import java.util.*;
public class EmployeeApp 
{		
	 Employee getEmployeeInfo(String str)
	 {
	 /*  given string    -   "abc@4356-uuuii#98000"   ;
	    name =abc,  ssn=4326,  dept=uuuii, sal=98
	    Cretae Employee Object with above details and return MEployee Object*/
		 Employee e=new Employee();
		e.name=str.substring(0,str.indexOf('@'));
		 e.ssn=str.substring(str.indexOf('@')+1,str.indexOf('-'));
		 e.dept=str.substring(str.indexOf('-')+1,str.indexOf('#'));
		 String s1=str.substring(str.indexOf('#')+1);
		 e.salary=Integer.parseInt(s1);
		 return e;
		
	 }
	

	/* 
	    in a given employee if ssn is - 1 to 10 employee level is L1
	if ssn is - 61 to 120 employee level is L2
	if ssn is - 121 to 180 employee level is L3
	else L4
	rteurn the given level"

	*/

	 String getEmployeeLevel(Employee e)
	 {
		 String level;
		 int s=Integer.parseInt(e.ssn);
			if(s>=-1 && s<=60)
				level="L1";
			else if(s>=61 && s<=120)
				level="L2";
			else if(s>=121 && s<=180)
				level="L3";
			else 
				level="L4";
			
		 
		 return level;
				
	 }
	public static void main(String[] args)
	{
			EmployeeApp e=new EmployeeApp();
			System.out.println(e.getEmployeeInfo("abc@4356-uuuii#98"));
			System.out.println(e.getEmployeeLevel(new Employee("abc","4356","uuuii",9889)));
			System.out.println(e.getEmployeeLevel(new Employee("sree","123","uii",125)));
			
	}
}
