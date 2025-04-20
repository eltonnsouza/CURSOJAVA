package cesao17;

public class exercicio {
    
    public static void main(String[] args) {
        
        celular iphone = new celular();

        iphone.marca = "apple";
        iphone.modelo = "iphone 15";

        iphone.ligar();
        iphone.desligar();
        iphone.usar(10);

       celular galaxy = new celular();

       galaxy.marca = "samsung";
       galaxy.modelo = "S10";
       
       galaxy.ligar();
       galaxy.desligar();
       galaxy.usar(0);


    // exercicio 2

    // estanciar o objeto

    aluno Elton = new aluno("Elton ", 123 , 57.78);

    System.out.println(Elton.getNome());

    System.out.println(Elton.getnotaFinal());

    Elton.setNome("Elton jonatas");

    // mudando a nota do aluno 
    Elton.setnotaFinal(75.00);

    Elton.exibirInfo();

   // criando outro aluno

    aluno maria = new aluno("maria", 1234 , 87.85);

    maria.exibirInfo();


// exercicio 3

produtoELetronico microondas = new produtoELetronico("microondas", 400, 12);


microondas.aplicarDesconto(15);

microondas.exibirInfo();


// exercicio 4

LivroBiblioteca livro1 = new LivroBiblioteca();

livro1.setTitulo(" java para iniciantes");

livro1.devolver();

livro1.pegarEmprestado();
livro1.pegarEmprestado();
livro1.devolver();

























    }

}
