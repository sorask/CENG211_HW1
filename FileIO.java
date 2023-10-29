package ceng211.hw1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
	
	public final static String PRODUCTS_FILE = "src\\ceng211\\hw1\\files\\products.csv";
	public final static String SHOP_ASSISTANTS_FILE = "src\\ceng211\\hw1\\files\\shopAssistants.csv";
	
	public static Product[] Products;
	public static ShopAssistant[] ShopAssistants;

	public FileIO() {
		int indexOfProductsTable = 0;
		
		Products = new Product[Product.NUMBER_OF_PRODUCTS];
		
		try(BufferedReader fileReader = new BufferedReader(new FileReader(PRODUCTS_FILE)))
		{		
			String line = "";
		  
			while ((line = fileReader.readLine()) != null)
			{
				String [] properties = line.split(";");
				
				Product tmpProduct = new Product(Integer.parseInt(properties[0]), properties[1], Double.parseDouble(properties[2].replaceAll(",",".")));
				
				Products[indexOfProductsTable] = tmpProduct;
				
				indexOfProductsTable++;
			}
			
		  fileReader.close();
		}
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
        catch (IOException ex){
            System.out.println(ex);
        }
		
		int indexOfShopAssistantsTable = 0;
		
		ShopAssistants = new ShopAssistant[ShopAssistant.NUMBER_OF_SHOP_ASSISTANS];
		
		try(BufferedReader fileReader = new BufferedReader(new FileReader(SHOP_ASSISTANTS_FILE)))
		{		
			String line = "";
		  
			while ((line = fileReader.readLine()) != null)
			{
				String [] properties = line.split(";");
				
				ShopAssistant tmpShopAssistant = new ShopAssistant(Integer.parseInt(properties[0]), properties[1], properties[2], properties[3]);

				ShopAssistants[indexOfShopAssistantsTable] = tmpShopAssistant;
				
				indexOfShopAssistantsTable++;
			}
			
		  fileReader.close();
		}
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
        catch (IOException ex){
            System.out.println(ex);
        }		
	}
}
