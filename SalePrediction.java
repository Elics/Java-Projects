/**
Question
A sales division of a company generate 62 percent of total sales. 
Based on that percentage,write a program that will predict how much
the sales division will generate if the company has $4.6 million in sales this year.
*/
import javax.swing.JOptionPane;

public class SalePrediction
{
   public static void main(String[] args)
   {
   //East Coast sales division total sales
   double percentageofTS = 0.62;
   double company        = 4.6;
   
   //total sale of East Coast division out of 4.6 million
   double toS      = 4.6*0.62;
   
   System.out.println("East Coast sales division generates $"+toS+" million"+ " of the total sale of the company.");
   
   }
}
