package cesao17;



public class POO2 {
    
// 1 - niveis de acesso
     public static void main(String[] args) {
    


     funcionario funcionario1 = new funcionario("elton", 3000, "test 123");

     funcionario1.exibirDados();

     funcionario1.nome = "teste";
     funcionario1.salario = 2500;
     //funcionario1.senha = "teste4321";

     funcionario1.exibirDados();

    funcionario1.aumentarSalario(25);
   
    //System.out.println(funcionario1.verificarSenha());

    if(funcionario1.autenticar("test 123")) {
        System.out.println("usuario autorizado");
    }else {
        System.out.println("senha invalida");
    }

//2 - classe imutável

  PessoaImutavel Elton = new PessoaImutavel("Elton", 40);

System.out.println(Elton.getNome());
System.out.println(Elton.getIdade());
























    }


}
