import java.util.Scanner;


public class ProblemAandBandCompilationErrors {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        long  cant = sc.nextLong(); 
        long s1=0, s2=0, s3=0, t1=0, t2=0;
        
        for(int i=0; i<cant;i++){
        	long  temp = sc.nextLong();
        	s1+=temp;
        }
        for(int i=0; i<cant-1;i++){
        	long  temp = sc.nextLong();
        	s2+=temp;
        }
        for(int i=0; i<cant-2;i++){
        	long  temp = sc.nextLong();
        	s3+=temp;
        }
        System.out.println((s1-s2));
        System.out.println((s2-s3));
	}

}
