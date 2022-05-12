
package basicjava;

import java.util.Random;

public class Array1 {

    public static void main(String[] args) {
       
        int x[]=new int[10];
        Random r=new Random();
        
        for(int i=0;i<10;i++){
            x[i]=r.nextInt(10)+5;
            System.out.print(" "+x[i]);
        }
        for(int k=0;k<x.length;k++)
            for(int l=0;l<x.length-k-1;l++)
            if(x[l]>x[l+1]){
                int temp=x[l];
                x[l]=x[l+1];
                x[l+1]=temp;
            }
        System.out.println("");
         for(int i=0;i<10;i++){
            
            System.out.print(" "+x[i]);
        }
    }
    
}
