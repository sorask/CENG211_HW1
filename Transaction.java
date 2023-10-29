package ceng211.hw1;

import java.util.Random;
import java.util.Arrays;

public class Transaction {
	
	final int SIZE_OF_PRODUCS_ARRAY = 3;
	final int RANDOM_NUMBER_RANGE_OF_QUANTITY = 10;
	
	private int id;
//gizlecek uyeler
	public Product[] arrayOfProducts;
	public int[] arrayOfQuantities;
	public double totalPrice;
	public double transactionFee;
	
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
		transactionFee = totalPrice * 0.01;
	}

//	public void setId(int id) 
//	{
//		this.id = id;
//	}
	
	public int getId() 
	{
		return this.id;
	}
	
    public String toString() {
        return this.id + " " + Arrays.toString(this.arrayOfProducts).toString() + " " + Arrays.toString(this.arrayOfQuantities) + " " + this.totalPrice+ " " + this.transactionFee;
    }
}
