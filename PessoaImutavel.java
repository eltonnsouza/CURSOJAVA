package cesao17;

 public class PessoaImutavel {
    
    private final String nome;
    private final int idade;

    // constritor , todas as auterações da classe imutavel
    // so podera ser feita no construtor
    public PessoaImutavel(String nome, int idade){

       this.nome = nome;
       this.idade = idade;

    }

    // toda a regra se aplica, so nao se altera os dados
    // nem fora da classe nem dentro da classe

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }




}
