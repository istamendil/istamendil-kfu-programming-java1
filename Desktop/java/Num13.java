public class Num13{ 
 public static void main(String[] args){
 	if (args.length<2){
			System.err.println("not correct");
			System.exit(1);
		}
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a="+a+"b="+b);
}
}