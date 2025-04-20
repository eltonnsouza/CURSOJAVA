package secao20;

public class Funcionario {
    
    protected String nome;
    protected double salario;

         // constritor
    public Funcionario(String nome, double salario) {
         // atribuir valor ao objeto (this.)
         this.nome = nome;
         this.salario = salario;
    }

         // metodos

     public void exibirDetalhes() {

         System.out.println("nome do funcionario: " + nome);
    }


}
