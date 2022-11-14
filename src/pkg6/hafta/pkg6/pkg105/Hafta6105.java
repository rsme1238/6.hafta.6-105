
package pkg6.hafta.pkg6.pkg105;

import java.util.Scanner;

public class Hafta6105 {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.println("please enter a number");
        int a  =input.nextInt();
        
         int t=0, s=0;
         
       
           
          for(int i =1; i<a; i++){
                 
             if(a % i == 0){
                 t=t+i;
                 s=s+1;
             }
       } 
           
        if( t/s == t/s){
            System.out.println("Aritmetik sayi");
        }  
        else{
            System.out.println("Aritmetik sayi degil");
        }
       
    }
    
}
