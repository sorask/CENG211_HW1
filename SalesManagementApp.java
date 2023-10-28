package ceng211.hw1;

//import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SalesManagementApp {
	
	private final static int NUMBER_OF_SALES_PERSON = 100;
	private final static int NUMBER_OF_TRANSACTIONS = 1500;
	private final static int TRANSACTION_PER_SALES_PERSON = 15;
	
    private final static String PRODUCTS_FILE = "src\\ceng211\\hw1\\files\\products.csv";
    private final static String SHOP_ASSISTANTS_FILE = "src\\ceng211\\hw1\\files\\shopAssistants.csv";
	
	public static void main(String[] args) {
		int indexOfProductsTable = 0;
		
		try(BufferedReader fileReader = new BufferedReader(new FileReader(PRODUCTS_FILE)))
		{		
			String line = "";
		  
			while ((line = fileReader.readLine()) != null)
			{
				String [] properties = line.split(";");
//				for (int i = 0; i < properties.length; ++i) {
//					System.out.println(properties[i]);
//				}

//				System.out.println(Integer.parseInt(properties[0]));
//				System.out.println(properties[1]);
//				System.out.println(Double.parseDouble(properties[2].replaceAll(",",".")));	
				
				Product tmpProduct = new Product(Integer.parseInt(properties[0]), properties[1], Double.parseDouble(properties[2].replaceAll(",",".")));
//				System.out.println(tmpProduct.toString());
				Product.Products[indexOfProductsTable] = tmpProduct;
			    
//				System.out.println(line);
//				System.out.println(Products[indexOfProductsTable].toString());
				
				indexOfProductsTable++;
			}
			
		  fileReader.close();
//		  System.out.println(indexOfProductsTable);
		}
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
        catch (IOException ex){
            System.out.println(ex);
        }
		
		for (int i = 0;i < Product.NUMBER_OF_PRODUCTS; i++) {
			System.out.println(Product.Products[i].toString());
		}
		
		Transaction tmpTransaction = new Transaction(0);
		System.out.println(tmpTransaction.arrayOfProducts[0].getName());
		System.out.println(tmpTransaction.arrayOfQuantities[0]);
		System.out.println(tmpTransaction.arrayOfProducts[1].getName());
		System.out.println(tmpTransaction.arrayOfQuantities[1]);
		System.out.println(tmpTransaction.arrayOfProducts[2].getName());
		System.out.println(tmpTransaction.arrayOfQuantities[2]);
		System.out.println(tmpTransaction.totalPrice);
		System.out.println(tmpTransaction.transactionFee);
	}
}
