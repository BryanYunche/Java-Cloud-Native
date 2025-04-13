package edu.Bryan.segundasemana;
public class MinhaClasse {


    public static void main(String [] args) {
        String nome01 = "Bryan Young";
        String nome02 = "Carvalho Soares";

        String nomeCompleto = nomeCompleto(nome01, nome02);


        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    
}
