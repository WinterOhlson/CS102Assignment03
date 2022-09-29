/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS102Assignment03;

/*
 *
 * @author jehuv
 */
import java.util.ArrayList;
public class PalindromeCheck {
    public static void main(String[] args)
    {
        String string1 = "Madam I'm adam";
        String string2 = "kayak";
        String string3 = "This is not a palindrome";
        
        System.out.println("Function returns " + palindromeCheck(string1) + " on string1.");
        System.out.println("Function returns " + palindromeCheck(string2) + " on string2.");
        System.out.println("Function returns " + palindromeCheck(string3) + " on string3.");
    }
    
    public static boolean palindromeCheck(String inputString)
    {
        ArrayList<Character> onlyLetters = new ArrayList<>();
        for(int i = 0; i < inputString.length(); i++)
        {
            int valueOfChar = (int) inputString.charAt(i);
            if(valueOfChar >= 65 && valueOfChar <= 90)
            {
                onlyLetters.add((char) (valueOfChar + 32));
            }
            else if(valueOfChar >= 97 && valueOfChar <= 122)
            {
                onlyLetters.add((char) valueOfChar);
            }
        }
        int k = onlyLetters.size() - 1;
        for(int i = 0; i <= onlyLetters.size() / 2; i++)
        {
            if(!onlyLetters.get(i).equals(onlyLetters.get(k)))
            {
                return false;
            }
            k--;
        }
        return true;
    }
}
