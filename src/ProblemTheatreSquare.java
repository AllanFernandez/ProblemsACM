import java.util.Scanner;


public class ProblemTheatreSquare {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long  n = sc.nextLong();
		long  m = sc.nextLong();
		long  a = sc.nextLong();
		double temp1=  Math.ceil((double)n/a);
		double temp2=	Math.ceil((double)m/a);
		long t =(long) ( temp1 * temp2);
		System.out.println(t);
	}

}
