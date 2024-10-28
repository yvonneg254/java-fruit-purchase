/*GLADYS WAMBUI WANJA 
    SCT121-0381/2023
    DIT 0403-ADVANCED OOP */

public class FruitPurchase {
    public static void main(String[] args) {
        // Prices of each fruit
        int priceApple = 30;
        int pricePineapple = 55;
        int priceOrange = 15;

        // Quantities of fruits bought by John, Peter, and Mary
        int johnApples = 3, johnPineapples = 5, johnOranges = 6;
        int peterApples = 4, peterPineapples = 2, peterOranges = 3;
        int maryApples = 10, maryPineapples = 1, maryOranges = 7;

        // Calculate individual costs
        int johnTotal = (johnApples * priceApple) + (johnPineapples * pricePineapple) + (johnOranges * priceOrange);
        int peterTotal = (peterApples * priceApple) + (peterPineapples * pricePineapple) + (peterOranges * priceOrange);
        int maryTotal = (maryApples * priceApple) + (maryPineapples * pricePineapple) + (maryOranges * priceOrange);

        // Calculate total cost (since John is paying for all)
        int totalCost = johnTotal + peterTotal + maryTotal;

        // John pays 1000 Ksh, calculate balance
        int johnPayment = 1000;
        int balance = johnPayment - totalCost;

        // Display the amounts
        System.out.println("Amount John needs to pay: " + johnTotal + " Ksh");
        System.out.println("Amount Peter needs to pay: " + peterTotal + " Ksh");
        System.out.println("Amount Mary needs to pay: " + maryTotal + " Ksh");
        System.out.println("Total amount John pays for all: " + totalCost + " Ksh");
        System.out.println("John's balance after paying 1000 Ksh: " + balance + " Ksh");
    }
}
