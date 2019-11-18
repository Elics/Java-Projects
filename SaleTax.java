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