/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS102Assignment03;

/**
 *
 * @author jehuv
 */
public class IsUnique {
    public static void main(String[] args)
    {
        String nonUnique = "Lama";
        String unique = "Dog";
        
        System.out.println("The first string returns " + isUnique(nonUnique));
        System.out.println("The second string returns " + isUnique(unique));
    }
    
    public static boolean isUnique(String inputString)
    {
        for(int i = 0; i < inputString.length() - 1; i++)
        {
            for(int k = i + 1; k < inputString.length(); k++)
            {
                if(inputString.charAt(i) == inputString.charAt(k))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
