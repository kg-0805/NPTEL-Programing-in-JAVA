import java.util.*;
public class Question3 {  
    public static void main(String[] args) { 
       try{	
	  byte barr[]={'N','P','T','E','L','-','J','A','V','A','J','A','N','-','N','O','C','C','S','E'};
          Scanner inr = new Scanner(System.in);
	  int n = inr.nextInt();
        String s2 = new String(barr,n,1);  
        System.out.println(barr[n]);
	System.out.println(s2); 
	}
catch (Exception e){
	    System.out.println("exception occur");
	    }	   
    }  
}  
