package ceng211.hw1;

public class SalesManagementApp {
	
	public final static int NUMBER_OF_TRANSACTIONS = 1500;
	public final static int TRANSACTION_PER_SHOP_ASSISTANTS = 15;
	
	public static FileIO files;
	
	public static Product[] Products;
	public static ShopAssistant[] ShopAssistants;
	
	public static TransactionManagement transactionManagement;
	
	public static void main(String[] args) {
	
		files = new FileIO();
		
		transactionManagement = new TransactionManagement();

		for (int i = 0; i < ShopAssistant.NUMBER_OF_SHOP_ASSISTANS; ++i) {
			FileIO.ShopAssistants[i].setCommision(SalaryManagement.calculateCommision(i));
			FileIO.ShopAssistants[i].setWeeklyBasedSalary(SalaryManagement.calculateWeeklyBasedSalary(FileIO.ShopAssistants[i].getSeniority()));
			FileIO.ShopAssistants[i].setSalary(4*FileIO.ShopAssistants[i].getWeeklyBasedSalary() + FileIO.ShopAssistants[i].getCommision());
			FileIO.ShopAssistants[i].setSales(SalaryManagement.calculateTotalRevenuePerShopAssistant(i));
		}
		
		for (int i = 0; i < ShopAssistant.NUMBER_OF_SHOP_ASSISTANS; ++i) {
			System.out.println("***************************************************************************");
			for (int j = 0; j < TRANSACTION_PER_SHOP_ASSISTANTS; ++j) {			
				System.out.println(TransactionManagement.arrayOfTransactions[i][j].toString());
			}
			System.out.println("***************************************************************************");
			System.out.println(FileIO.ShopAssistants[i].toString());
			System.out.println("***************************************************************************");
		}
		System.out.println("***************************************************************************");
		System.out.println("The highest-total-price transaction.");
		System.out.println("***************************************************************************");
		System.out.println(Query.theHighestTotalPriceTransaction().toString());
		System.out.println("***************************************************************************");
		System.out.println("The most expensive product in the lowest-price transaction.");
		System.out.println("***************************************************************************");
		System.out.println(Query.theLowestTotalPriceTransactionWithTheMostExpensiveProduct().toString());
		System.out.println("***************************************************************************");
		System.out.println("The lowest transaction fee.");
		System.out.println("***************************************************************************");
		System.out.println(Query.theLowestTransactionFee().toString());
		System.out.println("***************************************************************************");
		System.out.println("The highest-salary shop assistant.");
		System.out.println("***************************************************************************");		
		System.out.println(Query.theHighestSalaryShopAssistant().toString());
		System.out.println("***************************************************************************");
		System.out.println("The total revenue.");
		System.out.println("***************************************************************************");
		System.out.println(Query.totalRevenue());
		System.out.println("***************************************************************************");
		System.out.println("The total profit.");
		System.out.println("***************************************************************************");
		System.out.println(Query.totalProfit());
		System.out.println("***************************************************************************");
	}
}
