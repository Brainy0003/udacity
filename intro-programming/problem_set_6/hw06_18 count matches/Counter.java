//
// Complete the method in this class to return the number of strings
// that start with the target
//

import java.util.ArrayList;
public class Counter
{
   /**
    * Gets the number of strings that starts with the target
    * @param text the array list to process
    * @param target the desired letter
    * @return the count of strings starting with target
    */
    public int getCount(ArrayList<String> text, String target)
    {
       // TODO: Adapt an ArrayList algorithm to return
       // the number of String that start with the target
       int count = 0;
       int i = 0;
       while (i < text.size())
       {
           if (text.get(i).substring(0,1).compareTo(target) == 0)
           {
               count++;
               i++;
           }
           else
           {
               i++;
           }
       }
       return count;
    }
}
