package ceng211.hw1;

import java.util.Random;

public class Transaction {
	
	private final int SIZE_OF_PRODUCS_ARRAY = 3;
	private final int RANDOM_NUMBER_RANGE_OF_QUANTITY = 10;
	
	private int id;
	public Product[] arrayOfProducts;
	public int[] arrayOfQuantities;
	public double totalPrice;
	public double transactionFee;
	
	public  Transaction()
	{		
		id = -1;
		
//		Product[] arrayOfProducts = {new Product(), new Product(), new Product()};
		Product[] arrayOfProducts = new Product[SIZE_OF_PRODUCS_ARRAY];
		for (int i = 0; i <SIZE_OF_PRODUCS_ARRAY; i++)
			arrayOfProducts[i] = new Product();
		
//		int[] arrayOfQuantities = {-1, -1, -1};
		int[] arrayOfQuantities = new int[SIZE_OF_PRODUCS_ARRAY];
		for (int i = 0; i <SIZE_OF_PRODUCS_ARRAY; i++)
			arrayOfQuantities[i] = -1;
		
		totalPrice = -.0f;
		
		transactionFee = -.0f;
	}
	
	public  Transaction(int id)
	{
		this.id = id;
		
		totalPrice = .0f;
		transactionFee = .0f;
		
		arrayOfProducts = new Product[SIZE_OF_PRODUCS_ARRAY];
		arrayOfQuantities = new int[]{0, 0, 0};
		for (int i = 0; i <SIZE_OF_PRODUCS_ARRAY; i++) {
			Random randomProduct = new Random();
			int randomProductId = randomProduct.nextInt(Product.NUMBER_OF_PRODUCTS);
			arrayOfProducts[i] = Product.Products[randomProductId];
			Random randomQuantity = new Random();
			int randomQuantityValue = randomQuantity.nextInt(1,RANDOM_NUMBER_RANGE_OF_QUANTITY);
			arrayOfQuantities[i] = randomQuantityValue;
			totalPrice += randomQuantityValue * Product.Products[randomProductId].getPrice();
		}
		transactionFee = totalPrice * 0.01;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
	
	public int getId() 
	{
		return this.id;
	}
}
