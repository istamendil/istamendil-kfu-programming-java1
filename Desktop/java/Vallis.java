
 public class Vallis{
 	public static void main (String[] args){
 		
 			
 			 if (args.length<1){
 			 	System.err.println("no symbol");
 			 	System.exit(1);
 			 }
 			 int k = Integer.parseInt(args[0]);
 			 	int x=1;
 			 	double i=1;
 			 	for (x=1; x<k+1; x++) {
 			 		 i = i*2*x/(2*x-1)*2*x/(2*x+1);

				}
				i= i*2;
 			 	
 			 
			 System.out.println("p=" + i);
	}
}
			
