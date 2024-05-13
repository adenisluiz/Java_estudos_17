package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaForeach {
public static void main(String[] args) {
ArrayList<Integer> valores=new ArrayList<>();
ArrayList<Integer> dobro=new ArrayList<>();
ArrayList<Integer> dobroConsumer=new ArrayList<>();
ArrayList<Integer> par=new ArrayList<>();
ArrayList<Integer> impar=new ArrayList<>();

valores.add(1);
valores.add(2);
valores.add(3);
valores.add(4);
valores.add(5);


//v=valores
valores.forEach((v)->{
	dobro.add(v*2);
	if(v%2==0) {
		par.add(v);
	}else {
		impar.add(v);
	}
	});

//Valores consumer
Consumer<Integer> dobarConsumer=(v)->{dobroConsumer.add(v*2);};
valores.forEach(dobarConsumer);


System.out.println("Valores"+valores);
System.out.println("Dobrar"+dobro);
System.out.println("Dobrar Consumer"+dobroConsumer);
System.out.println(""+par);
System.out.println(""+impar);
System.out.println("Fim");

}
}
