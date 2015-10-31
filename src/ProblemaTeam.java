import java.util.Scanner;


public class ProblemaTeam {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long  cantDatos = sc.nextLong()*3;
		long cant1=0;
		long totalP=0;
		for(int i=0; i<cantDatos; i++){
			int multiplo3=(i+1)%3;
			long aux= sc.nextLong();
			if(aux==1){
				cant1++;
			}
			if(multiplo3==0 && cant1>=2){
				totalP++;
				cant1=0;
			}
			if(multiplo3==0){
				cant1=0;
			}
		}
		System.out.println(totalP);
	}

}
