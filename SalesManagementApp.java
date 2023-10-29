package ceng211.hw1;

//import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SalesManagementApp {
	
	final static int NUMBER_OF_SALES_PERSON = 100;
	final static int NUMBER_OF_TRANSACTIONS = 1500;
	final static int TRANSACTION_PER_SALES_PERSON = 15;
	
	final static int NUMBER_OF_PRODUCTS = 90;
	
    private final static String PRODUCTS_FILE = "src\\ceng211\\hw1\\files\\products.csv";
    private final static String SHOP_ASSISTANTS_FILE = "src\\ceng211\\hw1\\files\\shopAssistants.csv";
    
//    public static Product[] Products = new Product[NUMBER_OF_PRODUCTS];
    public static Product[] Products;
	
	public static void main(String[] args) {
		int indexOfProductsTable = 0;
		
		Products = new Product[NUMBER_OF_PRODUCTS];
		
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
				Products[indexOfProductsTable] = tmpProduct;
			    
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
		
//		for (int i = 0;i < NUMBER_OF_PRODUCTS; i++) {
//			System.out.println(Products[i].toString());
//		}
		
//		Transaction tmpTransaction = new Transaction(0);
//		System.out.println(tmpTransaction.getId());
//		System.out.println(tmpTransaction.arrayOfProducts[0].getName() + " " + tmpTransaction.arrayOfProducts[0].getId());
//		System.out.println(tmpTransaction.arrayOfQuantities[0]);
//		System.out.println(tmpTransaction.arrayOfProducts[1].getName() + " " + tmpTransaction.arrayOfProducts[1].getId());
//		System.out.println(tmpTransaction.arrayOfQuantities[1]);
//		System.out.println(tmpTransaction.arrayOfProducts[2].getName() + " " + tmpTransaction.arrayOfProducts[2].getId());
//		System.out.println(tmpTransaction.arrayOfQuantities[2]);
//		System.out.println(tmpTransaction.totalPrice);
//		System.out.println(tmpTransaction.transactionFee);
		
		int i = 1;
		int j = 1;
		TransactionManagement tmpTransactionManagement = new TransactionManagement();
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].getId());
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].arrayOfProducts[0].getName() + " " + tmpTransactionManagement.arrayOfTransactions[0][0].arrayOfProducts[0].getId());
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].arrayOfQuantities[0]);
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].arrayOfProducts[1].getName() + " " + tmpTransactionManagement.arrayOfTransactions[0][0].arrayOfProducts[1].getId());
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].arrayOfQuantities[1]);
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].arrayOfProducts[2].getName() + " " + tmpTransactionManagement.arrayOfTransactions[0][0].arrayOfProducts[2].getId());
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].arrayOfQuantities[2]);
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].totalPrice);
		System.out.println(tmpTransactionManagement.arrayOfTransactions[i][j].transactionFee);
	}
}
