//
// Complete the method in this class to find the average length of the words in an
// array list of strings and return it. The average length of words is sometimes used
// as a simple measure of reading difficulty.
//
// Note that you want to keep the fractional part of the average
//
// Hint: If yo udo not know where to start, look at the ArrayLit Algorithms to find an appropriate one.

import java.util.ArrayList;
public class StringArrays
{
   public double averageCountPerWord(ArrayList<String> words)
   {
       double average = 0;
       double count = 0.0; //defined as double so we do double division
       int sum = 0;

       // TODO: Find the total number of characters in all the words
       for (String word : words)
       {
           sum += word.length();
           count++;
       }


       // TODO: Calculate the average
       if (count > 0) //supply the condition
       {
          average = sum / count;
       }

       return average;
    }
}
