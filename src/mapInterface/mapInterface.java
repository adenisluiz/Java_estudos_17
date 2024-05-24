package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class mapInterface {
public static void main(String[] args) {
	 Map<Integer, String> mapaNomes = new HashMap<Integer, String>();
	    mapaNomes.put(1, "João Delfino");
	    mapaNomes.put(2, "Maria do Carmo");
	    mapaNomes.put(4, "Claudinei Silva");

	    //resgatando o nome da posição 4
	    System.out.println("Pela chave"+mapaNomes.get(4));
	    System.out.println("---------------___");
	    System.out.println(mapaNomes);
	    System.out.println("---------------");//coluna direita		   
	    System.out.println("Values/nomes"+mapaNomes.values());
	    System.out.println("---------------");//coluna esquerda		   
	    System.out.println("keyset"+mapaNomes.keySet());
	    System.out.println("---------------");//tudo		   
	    System.out.println("EntrySet"+mapaNomes.entrySet());


}
}
