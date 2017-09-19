public class Number5{
	public static void main(String[] args){
		
		if (args.length<1){
			System.err.println("not correct");
			System.exit(1);
   	}
      int x=Integer.parseInt(args[0]);
   	if (x<0){
   		System.err.println("not correct");
			System.exit(1);

   	}
   		double r=0;
   		int i;
         int k=Integer.parseInt(args[1]);//количество вложений
   		for ( i=k;i>0 ; i-- ){
   			r=x/((i+1)+r);
   		}
   		System.out.println("r="+(r+1));
 	}
 }
