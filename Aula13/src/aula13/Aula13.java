package aula13;

public class Aula13 {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        mamifero.emitirSom();
        
        Lobo lobo = new Lobo();
        lobo.emitirSom();
        
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        
        cachorro.reagir("Olá");
        cachorro.reagir("Vai apanhar");
        cachorro.reagir(11, 45);
        cachorro.reagir(21, 00);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2, 12.5f);
        cachorro.reagir(17, 4.5f);
    }
}
