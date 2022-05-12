
package basicjava;

public class StringTest {

    public static void main(String[] args) {
       String test="newyork";
       StringBuilder strbd=new StringBuilder(test);
       System.out.println(" "+strbd.reverse());
       
       String str="london";
     
        System.out.println(" London  ="+str.charAt(2));
        int i;
        for(i=str.length()-1;i>=0;i--){
            System.out.print ("  "+ str.charAt(i));
            //System.out.println(" "+i);
        }
       System.out.println(" ");
        reversestr("DhakA");
        
    }
    static void reversestr(String str1){
      String str=str1;
        for(int i=str.length()-1;i>=0;i--){
            System.out.print ("  "+ str.charAt(i));
            } 
    }
    
}
