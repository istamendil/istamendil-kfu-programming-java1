public class Num14{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if (args.length<1){
			System.err.println("not correct");
			System.exit(1);
		}
		int m=1;
		for (int i=1;i<=a; i++){
		   m=m*i;
		}
		System.out.println("a!="+m);
	}
}