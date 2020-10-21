package demo.product;

public class Customer {
	private String customer_name;
	private String address;
	private int mobile_no;
	
	public Customer()
	{
		
	}
	public Customer(String customer_name,String address,int mobile_no)
	{
		this.customer_name=customer_name;
		this.address=address;
		this.mobile_no=mobile_no;
	}
	
	public String showDetail()
	{
		return "Customer detail=\nCustomer name: "+customer_name+
				"\nAddress: "+address+"\nPin Code: "+mobile_no;
	}

}
