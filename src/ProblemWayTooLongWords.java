import java.util.Scanner;


public class ProblemWayTooLongWords {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long  cantDatos = sc.nextLong();
		for(long i=0; i<cantDatos; i++){
			String aux= sc.next();
			int size = aux.length();
			
			if(size>10){
				String sub = aux.substring(1, size-1);
				System.out.println(aux.substring(0, 1)+sub.length()+aux.substring(size-1, size));
			}else{
				System.out.println(aux);
			}
			
		}
		
	}

}


