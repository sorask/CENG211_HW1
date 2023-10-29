package ceng211.hw1;

import java.util.Random;
import java.util.Arrays;

public class Transaction {
	
	public final static int SIZE_OF_PRODUCS_ARRAY = 3;
	public final static int RANDOM_NUMBER_RANGE_OF_QUANTITY = 10;
	
	private int id;
	private Product[] arrayOfProducts;
	private int[] arrayOfQuantities;
	private double totalPrice;
	private double transactionFee;
	
	public  Transaction()
	{		
		id = -1;
		
//		arrayOfProducts = {new Product(), new Product(), new Product()};
		arrayOfProducts = new Product[SIZE_OF_PRODUCS_ARRAY];
		for (int i = 0; i < SIZE_OF_PRODUCS_ARRAY; i++)
			arrayOfProducts[i] = new Product();
		
//		arrayOfQuantities = {-1, -1, -1};
		arrayOfQuantities = new int[SIZE_OF_PRODUCS_ARRAY];
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
		
		Random random = new Random();
		
		for (int i = 0; i <SIZE_OF_PRODUCS_ARRAY; i++) {
//			Random randomProduct = new Random();
//			Random randomQuantity = new Random();			
			int randomProductId = random.nextInt(Product.NUMBER_OF_PRODUCTS);
			arrayOfProducts[i] = FileIO.Products[randomProductId];
			int randomQuantityValue = random.nextInt(RANDOM_NUMBER_RANGE_OF_QUANTITY) + 1;
			arrayOfQuantities[i] = randomQuantityValue;
			totalPrice += randomQuantityValue * FileIO.Products[randomProductId].getPrice();
		}
		transactionFee = calculateTransactionFee();
	}
	
	private double calculateTransactionFee()
	{
		double tmpTransactionFee = 0;
		
		if (totalPrice >= 1000 )
			tmpTransactionFee = totalPrice * 0.09;
		else if (totalPrice >= 800)
			tmpTransactionFee = totalPrice * 0.05;
		else if (totalPrice >= 500)
			tmpTransactionFee = totalPrice * 0.03;
		else
			tmpTransactionFee = totalPrice * 0.01;		

		return tmpTransactionFee;
	}
	
	public int getId() 
	{
		return this.id;
	}
	
	public double getTotalPrice()
	{
		return this.totalPrice;
	}
	
	public double getTransactionFee()
	{
		return this.transactionFee;
	}
	
	public Product[] getProducts()
	{
		return this.arrayOfProducts;
	}
	
    public String toString() {
        return this.id + " " + Arrays.toString(this.arrayOfProducts).toString() + " " + Arrays.toString(this.arrayOfQuantities) + " " + this.totalPrice+ " " + this.transactionFee;
    }
}
