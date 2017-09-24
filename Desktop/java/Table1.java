public class Table1 {
	public static void main(String[] args) {
		if (args.length<1){
			System.err.println("not correct");
			System.exit(1);
		}
		int w=Integer.parseInt(args[0]);
		if (w<1){
			System.err.println("not correct");
			System.exit(1);
		}
		for (int i=1; i<=w; i++){
			for (int j=1;j<=w; j++){
				System.out.printf("%-5d",i*j);
        	} 
        System.out.println(" ");   
		}
}
}
