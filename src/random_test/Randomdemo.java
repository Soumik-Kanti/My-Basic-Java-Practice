/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random_test;

import java.util.Random;


public class Randomdemo {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        //int randomNumber = rand.nextInt(91) + 10; // 0 to 9
        
        //System.out.println(randomNumber);
       
        
        int randomNumber = (int) (Math.random()*5) +1 ;
        
        System.out.println(randomNumber);
        
    }
    
}
