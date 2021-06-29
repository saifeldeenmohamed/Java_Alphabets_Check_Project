/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamPkg;

/**
 *
 * @author SaiF El-deen
 */
public class Alphabets {

  
    //Using normal function
    public static boolean onlyAlphabetsNorm(String str, int n)
    {
        
        if (str == null || str == "") 
        {
            return false;
        }
        
        for (int i = 0; i < n; i++) {
            if (!Character.isLetter(str.charAt(i))) 
            {
                return false;
            }
        }
        return true;
    }
    
    //Using Lambda function
    public static boolean onlyAlphabetsLamda(String str){
        
        return ( (str != null) && (!str.equals("")) && (str.chars().allMatch(Character::isLetter)));
    }
}
