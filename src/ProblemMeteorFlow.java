import java.util.Scanner;
import java.util.TreeMap;


public class ProblemMeteorFlow {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long  cant = sc.nextLong();
        TreeMap<Long, Long> tm = new TreeMap<Long, Long>();
        long  escudo=0, dañoT=0;
        long contador=0;
        for(int i=0; i<cant;i++){
            escudo = sc.nextLong();
            long  valorD = sc.nextLong();
            dañoT+=valorD;
            
            
            if(tm.containsKey(valorD)){
                long temp=tm.get(valorD)+1;
                tm.put(valorD, temp);
            }else{
                tm.put(valorD, (long) 1);
            }
            
            long aux=tm.lastKey();
            long aux2=tm.get(aux);
           if(escudo<dañoT){   
                dañoT-=aux;
                long r=aux2-1;
                if(r==0){
                    tm.remove(aux);
                }else{
                	tm.put(aux,r);
                }
                contador++;
           }
        }
        
        System.out.println(contador);

    }

}