public class SmartTv {
    /*Entrada das variáveis da SmartTv */
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    /*métodos relacionados a TV ligada/desligada */
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    /*métodos relacionados ao volume */
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    /*métodos para trocar de canal */
   

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

     public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    

    
}
