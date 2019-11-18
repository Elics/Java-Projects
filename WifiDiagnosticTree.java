// code challenges chapt 3 Q17

import javax.swing.JOptionPane;

public class WifiDiagnosticTree
{
   public static void main(String[] args)
   {
   String   input1,  input2, replyInput, reply1;
   String   input3,  input4, reply2, reply4;
   String   input5,  reply3, reply5;
   
   
   replyInput= "\nDid" +" that fix the problem?: ";
  String success = "Troubleshooting Successful!";
   JOptionPane.showMessageDialog (null, "Step 1: \nReboot the "+ "computer and "+ "try to connect.");
 
 //reply 1
  reply1  = JOptionPane.showInputDialog( replyInput);
  
  if (reply1.equalsIgnoreCase("yes"))
  {
  JOptionPane.showMessageDialog(null, success);
  }
  
  else 
  {
     JOptionPane.showMessageDialog(null, "Step 2: \nReboot the computer" + " and try to connect again.");
     reply2 = JOptionPane.showInputDialog(replyInput);
     
        if(reply2.equalsIgnoreCase("Yes"))
        {
        JOptionPane.showMessageDialog(null,success);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Step 3: \nMake sure the " + "cables between the " +"router & modem are"+ " plugged in firmly");
            reply3 = JOptionPane.showInputDialog(replyInput);
        
           if(reply3.equalsIgnoreCase("Yes"))
           {
           JOptionPane.showMessageDialog(null,success);
        }
           else
            {
            JOptionPane.showMessageDialog(null, "Step 4: \nMove the router" +" to a new location");
            reply4 = JOptionPane.showInputDialog(replyInput);
        
              if(reply4.equalsIgnoreCase("Yes"))
              {
              JOptionPane.showMessageDialog(null,success);
              }
               else
               {
                  JOptionPane.showMessageDialog(null, "Step 5: \nGet a new router");
                 } 
             }
         }
      }  
     
  
   
   System.exit(0);
   }
   }