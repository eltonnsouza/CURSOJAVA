package cesao17;

public class LivroBiblioteca {
    
// 1º criar os atributos da classe

    private String titulo;
    private String autor;
    private boolean disponivel = true;

// 2º metodos acessadores get/set

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){

        if(titulo != null && !titulo.isEmpty()){
           this.titulo = titulo;
         }else{ 

         System.out.println("titulo invalido!");
        }


    }

    // forma de saber se o livro esta disponivel

    public boolean estaDisponivel(){
        return disponivel;
    }

    public void pegarEmprestado() {
        if(disponivel){
           this.disponivel = false;
           System.out.println("voce pegou emprestado, o livro:  " + titulo );
        }else {
        System.out.println("o livro: " + titulo + "  nao esta disponivil!");
        }
    }

    public void setautor(String autor){
        this.autor = autor;
    }

    public String getautor(){
        return autor;
    }


    public void devolver(){
        if(!disponivel){
            disponivel = true;
            System.out.println("voce devolveu o livro: " + titulo);
        }else {
            System.out.println("o livro: " + titulo + " , ja esta disponivel!");
        }
    }


}
