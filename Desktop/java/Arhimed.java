public class Arhimed{
	public static void main(String[] args){
		double E=0.0001;
		int k=1;
		double a = -3;
		double b = -1;
		double sin = Math.sin(a);
		double sin1 = Math.sin(b);
		
		double y1 = sin-a-1;
		double y2 = sin1-b-1;
		double c=0;
		double y3=0;
		for  ( int i = 1; i>0 ; k++){
			c = (a+b)/2.0;
			double sin2 = Math.sin(c);
			y3 = sin2-c-1;
			if (y1*y3>=0){
				a=c;
			}	
				else{
					b=c;
				}
			
			if (Math.abs(a-b)<E){
				i=-1;
			}
		}
		System.out.println("k="+k+" "+"c="+c);
	}
}