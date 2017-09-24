/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danis_zam
 */
public class javaapplication4 {


 public static void main(String[] args) {
 	int n=Integer.parseInt(args[0]);
 	if (args.length<1){
			System.err.println("not correct");
			System.exit(1);
   		}
   	if (n<1){
			System.err.println("not correct");
			System.exit(1);
   		}
   		
 	int q;
 	int i;
    double w=0.5;
 	for (i=2;i<=n;i++){
 		int l=1;
 	    	for (q=1;q<=i-1;q++){
 	    		l=l*q*q;
 	    		 
 	    	}
 	    int z=1;
 	    for (q=1;q<=2*i;q++){
 	    	z=z*q;
 	    	 
 	    }
 	    double c = (double)l/z;
 	    w=w+c;
 	    
 	    }
 	    
 	System.out.println("w="+w);
 	}
 	
 }

