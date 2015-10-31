
import java.util.Scanner;
import java.util.TreeMap;


public class ProblemPrisionTransfer {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        long  cantPer = sc.nextLong();
        long  nivelMax = sc.nextLong();
        long  cantPxG = sc.nextLong();
        long contador=0, indice=0;
        TreeMap<Long, Long> tm = new TreeMap<Long, Long>();
       
        for(long i=0; i<cantPer;i++){
        	long  nvl = sc.nextLong();
            
           
            if(nvl<=nivelMax){
            	tm.put((long) (i), nvl);
            	if((indice+1)==cantPxG){
	            	contador++;
            		long temp=tm.firstKey();
	            	tm.remove(temp);
	            	indice--;
	            }
            	indice++;
            }else{
            	indice=0;
            	tm.clear();
            }
        }
        System.out.println(contador);
	}

}
