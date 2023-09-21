public class Usuario {
    public static void main(String[] args) throws Exception {
        /*Objeto da classe SmartTv */
        SmartTv smartTv = new SmartTv();

        /*Simulando o usuário diminuindo e aumentando o volume */
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo estado -> Volume atual: " + smartTv.volume);

        /*Simulando usuário trocando de canal */
        System.out.println("Canal atual: " +  smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("Canal atual: " +  smartTv.canal);

        /*Saídas para mostrar os estados atuais da TV */
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);

        /*Testes normais */
        smartTv.ligar();
                System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
            System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);



    }
}
