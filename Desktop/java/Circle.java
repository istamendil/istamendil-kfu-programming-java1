 public class Circle{
 		public static void main (String[] args){
 			
 			if (args.length<1){
 				System.err.println("please pass d");
 				System.exit(1);
 			}
 			int a= Integer.parseInt(args[0]);
 			if (a<=0){
 				System.err.println("not correct");
 				System.exit(1);

 			} 
			
		
				    double lengt= a*3.14;
					double area = (((a*a)/2)*3.14);
		System.out.println("lengt=" +lengt+" " + "area=" + area); 
}
}