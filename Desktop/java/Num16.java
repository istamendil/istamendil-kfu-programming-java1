public class Num16{
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		if (args.length<1){
				System.err.println("not correct");
				System.exit(1);
			} 
	  	int b;
	  	String m="";
		while(a>0){
			 b = a%2;  
	            System.out.print(b);
	            m = m + Integer.toString(b);  
	            a = a/2;
		}    
	 
	}
}