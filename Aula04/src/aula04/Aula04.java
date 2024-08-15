package aula04;

public class Aula04 {
    public static void main(String[] args) {
        /*
        Caneta c1 = new Caneta();
        
        c1.setModelo("BIC");
        // c1.modelo = "BIC";
        
        c1.setPonta(0.5f);
        // c1.ponta = 0.5f;
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        */
        
        Caneta c1 = new Caneta("NIC", 0.4f, "Amarelo", true);
        c1.status();
        
        Caneta c2 = new Caneta("BIC", 1.5f, "Laranja", true);
        c2.status();
    }
}
