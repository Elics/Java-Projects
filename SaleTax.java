/**
Sales Tax
Write a program that will ask the user to enter the amount of a purchase. 
The program should then coompute the state and county sales tax.
Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
The program should display the amount of the purchase plus the total sales tax, 
and the total of the sale
(which is the sum  of the amount of purchase plus the total sales tax)
*/

import javax.swing.JOptionPane;
   //decimals

public class SaleTax
{
   public static void main(String[] args)
{
 double amount;
 String amountStr = JOptionPane.showInputDialog("What is the amount of your purchase?");
 amount = Double.parseDouble(amountStr);
 double stateTax = 0.04 * amount, countyTax = 0.02 * amount;
 double totalAmount = (stateTax + countyTax + amount);
   
   
   System.out.println("Your amount of Purchase is $"+ amount);
   System.out.println("Your state tax amount is $" + stateTax);
   System.out.println("Your county tax amount is $" + countyTax);
   System.out.println("Your total amount is $" + totalAmount);
}
}
