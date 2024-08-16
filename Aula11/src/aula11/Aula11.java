package aula11;

public class Aula11 {
    public static void main(String[] args) {
        // Pessoa pessoa1 = new Pessoa();
        
        Visitante visitante1 = new Visitante();
        visitante1.setNome("Juvenal");
        visitante1.setIdade(22);
        visitante1.setSexo("M");
        System.out.println(visitante1.toString());
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Cláudio");
        aluno1.setMatricula(1111);
        aluno1.setCurso("Informática");
        aluno1.setIdade(16);
        aluno1.setSexo("M");
        aluno1.pagarMensalidade();
        
        Bolsista bolsista1 = new Bolsista();
        bolsista1.setMatricula(1112);
        bolsista1.setNome("Jubileu");
        bolsista1.setBolsa(12.5f);
        bolsista1.setSexo("M");
        bolsista1.pagarMensalidade();
    }
}
