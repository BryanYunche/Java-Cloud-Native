// class ExemploBreakContinue.java
public class ExemploBreakContinue {
	public static void main(String[] args) {
	
    //A ideia é interromper o fluxo e parar o laço
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			break;
		    System.out.println(numero);
		
	}

    System.out.println("=========================");
    //A ideia é mudar o fluxo mediante uma contição
    for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			continue;
            System.out.println(numero);
		
	}

    }


}