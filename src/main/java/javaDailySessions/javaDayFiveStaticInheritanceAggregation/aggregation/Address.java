package javaDailySessions.javaDayFiveStaticInheritanceAggregation.aggregation;

public class Address {  
	String city,state,country;  
	  
	//constructor
	public Address(String city, String state, String country) {  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	    System.out.println("I am from Address Constructor " +this.city+" "+state+" "+country);
	}  
	
	public void displayData() {
		System.out.println("I am from Address Constructor " +city+" "+state+" "+country);
	}
	
	public static void main(String[] args) {  
		Address address1=new Address("chn","TN","india");  
		Address address2=new Address("gno","UP","india"); 
		System.out.println(address1);
		System.out.println(address1.city);
		  
	}
	  
	}
