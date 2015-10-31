
import java.util.Scanner;


public class ProblemB {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long  cantG = sc.nextLong();
		int cant1=0;
		int cant2=0;
		int cant3=0;
		int cantTaxis=0;
		for(int i=0; i<cantG;i++){
			long temp = sc.nextLong();
			if(temp==4){
				cantTaxis++;
			}if(temp==3){
				cant3++;
			}if(temp==2){
				cant2++;
			}if(temp==1){
				cant1++;
			}
		}
		cant1=cant1-cant3;
		if(cant1<0){
			cant1=0;
		}
		cantTaxis+=cant3;
		cantTaxis+=(int) cant2/2;// Aqui quede ---- sumar cantidad de dos
		if((cant2%2)>0 ){
			cant1-=2;
			cantTaxis++;
			if(cant1<0){
				cant1=0;
			}
		}
		if(cant1>0){
			cantTaxis+=(int)cant1/4;
			if(cant1%4 !=0){
				cantTaxis++;
			}
			
		}
		System.out.println(cantTaxis);

	}

}
