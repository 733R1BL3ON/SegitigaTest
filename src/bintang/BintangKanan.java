/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang;

/**
 *
 * @author 733R1BL3
 */
public class BintangKanan {
       public static void main(String[] args) {
      int x=5;
        int i;
        int j,k;
        for (i=1;i<=5;i++){
            for(j=4;j>=i;j--){
              System.out.print (" ");
            }
            for(k=1;k<=i;k++){
              System.out.print ("*");
            }
          System.out.println();
        }
    
    }
       
}
