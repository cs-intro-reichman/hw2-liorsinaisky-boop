public class CalcPi {
	public static void main(String [] args) {
		int x = Integer.parseInt(args[0]);
		int i =0 ;
		double sum=0;
		int div =1;
		int neg = 1;
		for(;i<x;i++){
           sum = sum + 1.0/(div)*neg;
		   neg = neg*-1;
		   div = div + 2;
		}
		System.out.println("pi acourding to java: " + Math.PI);
        System.out.println("pi, approximated:     " + sum*4);
	}
}
