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
public class MainClass {
    public static void main(String args[]){
        
        String str1 = "HelloEveyone";
        int len1 = str1.length();
        
        String str2 = "HelloEveyone123";
        int len2 = str2.length();

        
        System.out.println("First string: " + Alphabets.onlyAlphabetsNorm(str1, len1));
        System.out.println("Second string: " + Alphabets.onlyAlphabetsNorm(str2, len2));
        
        System.out.println("First string: " + Alphabets.onlyAlphabetsLamda(str1));
        System.out.println("Second string: " + Alphabets.onlyAlphabetsLamda(str2));
        
    
}
}
