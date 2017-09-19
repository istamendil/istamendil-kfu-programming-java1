public class Table {
	public static void main(String[] args) {
		
		int w=Integer.parseInt(args[0]);
		for (int i=1; i<=w; i++){
			for (int j=1;j<=10; j++){
				if (i*j>9){
					System.out.print(i*j+"   ");
            	}
            	else{ 
            		System.out.print(i*j+"    ");
            	}
        	} 
        System.out.println(" ");   
		}
}
}
