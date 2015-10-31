import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ProblemVictorsResearch {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		long A = in.nextLong();
		long S = in.nextLong();
		Map<Long,Long> mapSumaCount= new HashMap<Long,Long>();
		long suma = 0;
		long cont = 0;
		long indice = 0;
		long v = 0;
		for ( v = 1; v <=A; v++) {
			long temp = in.nextLong();
			suma = suma + temp;
			indice = suma - S;
			Long valor = mapSumaCount.get(indice);
			if(valor!= null){
				cont+=valor;
				
			}
			
			Long value = mapSumaCount.get(suma);
			if(value== null){
				mapSumaCount.put(suma, (long) 1);
				
			}else{
				value++;
				mapSumaCount.put(suma, value);
			}	
			
			if(suma==S)
				cont++;
			
			
			
		}

		System.out.println(cont);
		}
}


