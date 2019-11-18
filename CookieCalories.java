import javax.swing.JOptionPane;

public class CookieCalories
{
   public static void main(String[] args)
   {
   /*There are 40 cookies in one bag,
   10 servings in a bag,
   and 300 calories in a servings
   therefore 4 cookies is one serving 
   and 1 cookie is 75 calories.
   */
   
   String cookiesAteStr;
   int cookiesAte;
   int oneBagOfCookies = 40,           servingInABag  = 10;
   int caloriesInOneServing = 300,     oneCookie      =  75;
   
   cookiesAteStr = JOptionPane.showInputDialog("How many cookies did you eat?");
   cookiesAte = Integer.parseInt(cookiesAteStr);
   
   //output
   System.out.println("You've consumed " +(cookiesAte * oneCookie)+" calories.");
   
   System.exit(0);
   
   
   
      
   }
}