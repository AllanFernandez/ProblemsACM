
import java.util.Scanner;
import java.util.TreeMap;



public class ProblemAirport {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long  cantP = sc.nextLong();        //Cantidad de pasajeros
        long  cantA = sc.nextLong();        //Cantidad de Aviones
        TreeMap<Long, Long> tmMax = new TreeMap<Long, Long>();
        TreeMap<Long, Long> tmMin = new TreeMap<Long, Long>();
        
        long value=0;
        long totalMin=0,totalMax =0;
        for(int i=0; i<cantA; i++){
            long  temp = sc.nextLong();
            if(tmMax.containsKey(temp)){
                value=tmMax.get(temp)+1;
                tmMax.put(temp, value);
                tmMin.put(temp, value); 
            }else{
            	tmMax.put(temp, (long)1); 
            	tmMin.put(temp, (long)1); 
                
            }
        }
        for(int i=0; i<cantP;i++){
        	long min=0,max=0,value1=0,value2=0;
        	max=tmMax.lastKey();  
            min=tmMin.firstKey();  
            
            value1=tmMax.get(max); 
            value2=tmMin.get(min);
            
            totalMax=totalMax+max;
            totalMin=totalMin+min;
            
            long r1=value1-1;
            long r2=max-1;
            
            if(tmMax.containsKey(r2)){
            	long temp=tmMax.get(r2) +1;
            	tmMax.put(r2,temp);
        	}else{
        		tmMax.put(r2,(long)1);
        	}
            if(r1>0){
            	tmMax.put(max,r1);
            	
            }else{
            	 tmMax.remove(max);
            }
            
            long resta=value2-1;
            long resta2=min-1;
            if(resta2>0){
	            if(tmMin.containsKey(resta2)){
	                tmMin.put(resta2,(long) +1);
	        	}else{
	        		tmMin.put(resta2,(long)1);
	        	}
            }
            if(resta>0){
            	tmMin.put(min,resta);
            	
            }else{
            	 tmMin.remove(min);
            }
            
        }
        
        System.out.println(totalMax+" "+totalMin);

    }

}
