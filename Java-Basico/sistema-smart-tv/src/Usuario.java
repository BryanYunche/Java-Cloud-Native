public class Usuario {

    public static void main(String[] args) {
        //Criei um objeto do tipo smart tv
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        
        
        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        System.out.println("Novo volume: " + smartTv.volume);
        

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(29);
        System.out.println("Canal atual: " + smartTv.canal);

        


    }
    
}
