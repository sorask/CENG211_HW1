package ceng211.hw1;

import java.util.Arrays;

public class Transaction {
	private final int SIZE_OF_PRODUCS_ARRAY = 3;
	
	private int id;
	private Product[] arrayOfProducts;
	private int[] arrayOfQuantities;
	private double totalPrice;
	private double transactionFee;
	
	public  Transaction()
	{
		id = -1;
		
//		Product[] arrayOfProducts = {new Product(), new Product(), new Product()};
		Product[] arrayOfProducts = new Product[SIZE_OF_PRODUCS_ARRAY];
		for (int i = 0; i <=SIZE_OF_PRODUCS_ARRAY - 1; i++)
			arrayOfProducts[i] = new Product();
		
//		int[] arrayOfQuantities = {-1, -1, -1};
		int[] arrayOfQuantities = new int[SIZE_OF_PRODUCS_ARRAY];
		for (int i = 0; i <=SIZE_OF_PRODUCS_ARRAY; i++)
			arrayOfQuantities[i] = -1;
		
		totalPrice = .0f;
		
		transactionFee = .0f;
	}
	
	public  Transaction(int id, Product[] arrayOfProducts, int[] arrayOfQuantities)
	{
		this.id = id;
		
		this.arrayOfProducts = new Product[SIZE_OF_PRODUCS_ARRAY];
		this.arrayOfProducts = Arrays.copyOf(arrayOfProducts, SIZE_OF_PRODUCS_ARRAY);		
//		for (int i = 0; i <=SIZE_OF_PRODUCS_ARRAY - 1; i++)
//			this.arrayOfProducts[i] = arrayOfProducts[i];
		
		this.arrayOfQuantities = new int[SIZE_OF_PRODUCS_ARRAY];
		this.arrayOfQuantities = Arrays.copyOf(arrayOfQuantities, SIZE_OF_PRODUCS_ARRAY);
		
//		for (int i = 0; i <=SIZE_OF_PRODUCS_ARRAY - 1; i++)
//			this.arrayOfQuantities[i] = arrayOfQuantities[i];
		
		totalPrice = -.1f;
		
		transactionFee = -.1f;
	}	
}
