import java.util.Scanner;


public class ProblemDominopiling {
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long  m = sc.nextLong();
		long  n = sc.nextLong();
		long r1=m%2;
		long r2=n%2;
		long tF=0;
		if(r1==0||r2==0){
			tF=(m*n)/2;
		}else{
			tF=(long)Math.floor((double)((m*n)/2));
		}
		System.out.println(tF);
	}

}
