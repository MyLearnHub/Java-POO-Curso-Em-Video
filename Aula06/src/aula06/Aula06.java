package aula06;

public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.maisVolume();
        controle.play();
        controle.ligarMudo();
        controle.abrirMenu();
        controle.fecharMenu();
        controle.desligar();
    }
}
