import java.util.Scanner;


public class ProblemWatermelon {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long num= sc.nextLong();
		
		if(num!=2){
			if((num%2)==0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
	
		}else{
			System.out.println("NO");
		}
	}
}
