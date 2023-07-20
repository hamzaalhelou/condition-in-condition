/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condition;

/**
 *
 * @author Moatasem
 */
public class MainIf {
    
    //  وضع شرط داخل شرط
    
     public static void main(String[] args) {
 
        boolean isMale = true;
        int age = 25;
 
        if(isMale == true)
        {
            System.out.println("Gender: male");
            
            if( age <= 21 )
            {
                System.out.println("He is a young boy");
            }
        }
        
        else
        {
            System.out.println("Gender: female");
            
            if (age <= 25)
            {
                System.out.println("She is a young girl");
            }
        }
 
    }
    
}
