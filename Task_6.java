public class Task_6 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double s = 0.5; 
		int f1 = 1; 
		int f2 = 2;
		int x = 1;
		for (int i = 2; i <= n; i++) {
			f1 *= (i - 1);
			f2 *= (i+x)*(i+x+1);
			x++;
			s += f1 * f1 / f2;
		}
		System.out.println(s);
		
	}
}