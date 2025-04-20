package cesao17;

public class funcionario {
    
    // diferentes niveis de acesso

public String nome;
protected double salario;
private String senha;

// construtor tem a mesma habilidade dos metodos
// ele vai conseguir modificar esses dados
// independente do acesso ssta publico ou privado

     public funcionario(String nome, double salario , String senha){

        this.nome = nome;
        this.salario = salario;
        this.senha = senha;

    }
         
    public void exibirDados() {
        System.out.println("nome: " + nome + ", salario: " + salario + ", senha: " + senha );
    }

    protected void aumentarSalario(double porcentagem) {

 // logica de aumento de salario

          this.salario += ((this.salario * porcentagem) / 100);
          System.out.println("o salario agora é de: " + salario);
    }

    private boolean verificarSenha(String tentativaSenha){
        // compara a String
          return this.senha.equals(tentativaSenha);
    }

    public boolean autenticar(String tentativaSenha) {
        // outras logicas
        return verificarSenha(tentativaSenha);
    }





}
