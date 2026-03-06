public class ProfitCalculator {
    public static void main(String[] args) {
        // Variable declarations
        int costPrice = 129;
        int sellingPrice = 191;
        int profit;
        double profitPercentage;
        
        // Calculate profit and profit percentage
        profit = sellingPrice - costPrice;
        profitPercentage = (double) profit / costPrice * 100;
        
        // Display output using single print statement with multiline text
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}

