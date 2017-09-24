
public class Well {
	public static void main (String[] args){
		
		if (args.length<1) {// сколько параметров необходимо столько и вводим
			System.err.println("not correct");
			System.exit(1);
		}
		float a = Float.parseFloat(args[0]);
		if (a<=0) {// сколько параметров необходимо столько и вводим
			System.err.println("not correct");
			System.exit(1);
		}
		
		
			
			double b=(9.8*a*a)/2; 
		System.out.println("height="+b);
	}
}