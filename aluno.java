package cesao17;

public class aluno {
    
    // 1 primaeiro, declarar as propriedades

    private String nome;

    // private int matricula;

    private double notaFinal;

    // construtor parametrizado

    public aluno(String nome, int matricula, double notaFinal){
        this.nome = nome;

    // this.matricula = matricula;

        this.notaFinal = notaFinal;
    }

     // metodos acessadores get/set

    public String getNome(){
        return nome;
   }
     // setNome, para fazer a verificação

     public void setNome(String nome){
    // nome nao pode ser igual a nulo. e 
      if(nome != null && !nome.isEmpty()){
          this.nome = nome;
      }else{
        System.out.println("nome invalido.");
      }
}


    public double getnotaFinal(){
        return notaFinal;
    }

    public void setnotaFinal(double notaFinal){
        if(notaFinal >= 0 && notaFinal <= 100){
            this.notaFinal = notaFinal;
        }else{
            System.out.println("nota invalida");
        }
    }

    // metodo auxiliar

    public void exibirInfo(){
        System.out.println("o aluno: " + nome + ", obteve a nota final de: " + notaFinal);
    }










}










