package ceng211.hw1;

public class Product {
	
	private int id;
	private String name;
	private double price;
	
	public Product()
	{
		id = -1;
		name = "Acmes";
		price = -.0f;
	}

	public Product(int id, String name, double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public int getId() 
	{
		return this.id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName ()
	{
		return this.name;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public double getPrice() 
	{
		return this.price;
	}
	
    public String toString() {
        return this.id + " " + this.name + " " + this.price;
    }
}
