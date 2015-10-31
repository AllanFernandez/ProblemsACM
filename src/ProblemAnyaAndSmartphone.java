import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ProblemAnyaAndSmartphone {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long  nApp = sc.nextLong();
		long  nAppE = sc.nextLong();
		long  nIcn = sc.nextLong();
		Map<Long,Integer> mp= new HashMap<Long,Integer>();
		long[] arrApp= new long[(int) nApp];
		long contador=0;
		
		for(int indice=0; indice<nApp+nAppE; indice++){
			long temp = sc.nextLong();
		
			if(indice<nApp){
			
				arrApp[indice]=temp;
				mp.put(temp, indice);	// guardamos < id,indice> 
			
			}else{
				int i= mp.get(temp);
				contador+= (long) Math.ceil((double)(i+1)/nIcn);
				if(i>0){
					long temp2 = arrApp[(i-1)];
					arrApp[(i-1)] = temp;
					arrApp[i] = temp2;
					mp.replace(temp, i-1);
					
					if(mp.containsKey(arrApp[i])){
						mp.replace(temp2, i);
					}
				}
				
			}
			
		}
		System.out.println(contador);

	}

}
