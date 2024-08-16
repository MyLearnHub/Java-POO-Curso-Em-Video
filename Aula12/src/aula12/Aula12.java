package aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        
        mamifero.setPeso(35.5f);
        mamifero.setCorPelo("Marrom");
        mamifero.alimentar();
        mamifero.locomover();
        mamifero.emitirSom();
        
        ave.locomover();
        
        peixe.locomover();
        
        reptil.locomover();
        
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        Goldfish goldfish = new Goldfish();
        Arara arara = new Arara();
        
        canguru.locomover();
        canguru.emitirSom();
        
        cachorro.locomover();
        cachorro.emitirSom();
        
        
    }
}
