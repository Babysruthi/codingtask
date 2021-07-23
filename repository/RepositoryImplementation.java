package repository;

class InvalidcodeException extends Exception
{
	InvalidcodeException(String msg)
	{
		super(msg);
	}
}
class Repository
{
	static String getCountryName(String countryCode) throws InvalidcodeException
	{ 
		int c=Integer.parseInt(countryCode);
		String country=null;
		if(c>=70 && c<=99)
			country="India";
		else if(c==908)
			country="US";
		else if(countryCode.equals("011"))
			throw new InvalidcodeException("Dial somewhere outside of USA");
		else
			throw new InvalidcodeException("No country with given code found");
		
		return country;
//70 to 99  -India
//908 = US

//011      -Dial somewhere outside of USA 

// No country with given code found

 }
	
}

public class RepositoryImplementation
{
	public static void main(String[] args)throws Exception
	{
		Repository r=new Repository();
		System.out.println(r.getCountryName("80"));
		System.out.println(r.getCountryName("011"));
	
	}
	
}
