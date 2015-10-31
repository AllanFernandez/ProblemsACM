import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ProblemRegistrationsystem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long  cant = sc.nextLong();
		Map<String,Long> nombre = new HashMap<String,Long>();
		String aux="";
		for(int i=0; i<cant; i++){
			aux= sc.next();
			if(nombre.containsKey(aux)){
				long value=nombre.get(aux)+1;
				nombre.put(aux,value); // guardamos el key con la nueva concurrencia
				aux+=value;
				nombre.put(aux,(long)0); //guardamos el nuevo key con concurrencia 0
				System.out.println(aux);
			}else{
				System.out.println("OK");
				nombre.put(aux,(long)0);//guardamos el nuevo key con concurrencia 0
			}
		}

	}

}
