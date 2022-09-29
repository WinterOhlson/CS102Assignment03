/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS102Assignment03;

/**
 *
 * @author jehuv
 */
public class CapitalizeSentence {
    public static void main(String[] args)
    {
        String string1 = "how many people are there? I think there's 18 people. yes, there's 18 people.";
        System.out.println("The capitalized version of the string is: ");
        System.out.println(capitalizeSentence(string1));
    }
    
    public static String capitalizeSentence(String inputString)
    {
        boolean capitalizeNext = true;
        char[] newString = new char[inputString.length()];
        
        for(int i = 0; i < inputString.length(); i++)
        {
            int charValue = (int) inputString.charAt(i);
            if(charValue == 46)
            {
                capitalizeNext = true;
                newString[i] = inputString.charAt(i);
            }
            else if(capitalizeNext == true && charValue >= 97 && charValue <= 122)
            {
                newString[i] = (char) (charValue - 32);
                capitalizeNext = false;
            }
            else if(capitalizeNext == true && charValue >= 65 && charValue <= 90)
            {
                newString[i] = inputString.charAt(i);
                capitalizeNext = false;
            }
            else
            {
                newString[i] = inputString.charAt(i);
            }
        }         
        return String.valueOf(newString);
    }
}
