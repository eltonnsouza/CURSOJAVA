package cesao17;

public class pessoa {

     private String nome;
     private int idade;

     public void setNome(String nome){
        //  sempre utilizar o this -> objeto
        
       this.nome = nome;

     }

     // auterar os valores via metodo get / set
    public String getNome() {
      return nome;
    }

public void setIdade(int idade){
    this.idade = idade;
}

public int getidade(){
    return idade;
}

}
