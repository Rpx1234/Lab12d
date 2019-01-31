//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;


public class Lab12dv2Student
{
   public static void main(String args[])
   {
   String sentence;
   String piglatin;
   String chopper;
   String word;
   sentence = "i went to the store";
   piglatin = getPigLatin(sentence);
   out.println(sentence + " changed to " + piglatin);
   out.println(" ");
   //add in the rest of the test cases
   sentence = " the big bad wolf";
   piglatin = getPigLatin(sentence);
   out.println(sentence + " changed to " + piglatin);
   out.println(" ");
   sentence = "it was a sunny day";
   piglatin = getPigLatin(sentence);
   out.println(sentence + " changed to " + piglatin);
   out.println(" ");
   sentence = "i am sam i am";
   piglatin = getPigLatin(sentence);
   out.println(sentence + " changed to " + piglatin);
   out.println(" ");
   //add in keyboard input if you want

   
   }


public static String getPigLatin(String sentence)
 {
  String pigLatin = "";
  //logic here
  Scanner chopper = new Scanner(sentence);
  while (chopper.hasNext())
  { 
    String word = chopper.next();
    if (word.charAt(0) =='a' || word.charAt(0) =='e' ||
    word.charAt(0) =='i' || word.charAt(0) =='o' ||word.charAt(0) =='u')
    {
      pigLatin =pigLatin + " " + word + "ay";
    } 
    else
    {
      pigLatin =pigLatin + " " +word.substring(1) + word.substring(0,1) + "ay" ;
    }
  }
  return pigLatin;
 
 }
}