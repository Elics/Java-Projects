/**
Sorted names
Write a program that asks the user to enter three names and then
displays the names in ascending order.
*/

// alphabetical order of 3 words
import javax.swing.JOptionPane;

public class Alpha
{
   public static void main(String[] args)
   {
    
      String name1, name2, name3;
      String output  ="";
      
      
      name1   = JOptionPane.showInputDialog("Enter the first book title: ");
      name2   = JOptionPane.showInputDialog("Enter the second book title: ");
      name3   = JOptionPane.showInputDialog("Enter the third book title: ");
      
      if (name1.compareToIgnoreCase(name2) <0 && name1.compareToIgnoreCase(name3)<0)
      { output  +=name1+ "\n";
         if (name2.compareToIgnoreCase(name3) <0){
         output +=name2 +"\n";
         output +=name3 + "\n";
         }
         else{
         output +=name3 +"\n";
         output +=name2 +"\n";
         }
     }
     
       else if (name2.compareToIgnoreCase(name1) <0 && name2.compareToIgnoreCase(name3)<0)
      { output  +=name2+ "\n";
         if (name1.compareToIgnoreCase(name3) <0){
         output +=name1 +"\n";
         output +=name3 + "\n";
         }
         else{
         output +=name3 +"\n";
         output +=name1 +"\n";
         }
     }

  else if (name3.compareToIgnoreCase(name2) <0 && name3.compareToIgnoreCase(name1)<0)
      { output  +=name3+ "\n";
         if (name2.compareToIgnoreCase(name1) <0){
         output +=name2 +"\n";
         output +=name1 + "\n";
         }
         else{
         output +=name1 +"\n";
         output +=name2 +"\n";
         }
     }

  
   
   JOptionPane.showMessageDialog(null, output);
   
         
     System.exit(0);    
  
   }
}
