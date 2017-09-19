import java.util.Scanner;
public class Massiv{
	public static void main  (String[] args){
		
				int [] x= new int [100];
int o;
		Scanner b = new Scanner(System.in);
		Scanner k = new Scanner(System.in);
		 int l=k.nextInt();
		for ( o=0; o<l;o++){
			x[o]=b.nextInt();
			x[o+1]=b.nextInt();
			x[o+2]=b.nextInt();

		}
		System.out.println(x[1]);
	}
}