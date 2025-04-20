package cesao17;

public class Livro {
    
private String titulo;
private String autor;
private double preco;

// nesse construtor vamos usar valores fixos
// fallback 
public Livro(){

        this.titulo = " teste";
        this.autor = "autor";
        this.preco = 16.99;
}
// override
 public Livro(String titulo, String autor, double preco){
      this.titulo = titulo;
      this.autor = autor;
      this.preco = preco;

    }


 public void exibirInfo(){
    System.out.println("titulo: " + titulo + " , autor: " + autor + "preço : " + preco);
 }











}

  



