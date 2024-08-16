package projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Aluno pessoa2 = new Aluno();
        Professor pessoa3 = new Professor();
        Funcionario pessoa4 = new Funcionario();
        
        pessoa1.setNome("Pedro");
        pessoa2.setNome("Maria");
        pessoa3.setNome("Cláudio");
        pessoa4.setNome("Fabiana");
        
        pessoa1.setSexo("M");
        pessoa4.setSexo("F");
        pessoa2.setIdade(18);
        
        pessoa2.setCurso("Informática");
        pessoa3.setSalario(2500.75f);
        pessoa4.setSetor("Estoque");
        
        // pessoa1.receberAumento(550.20);
        // pessoa2.mudarTrabalho();
        // pessoa4.cancelarMatr();
        
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
        System.out.println(pessoa4.toString());
    }
}
