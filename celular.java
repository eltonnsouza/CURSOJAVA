package cesao17;

public class celular {

// criando os atributos da classe

String marca;
String modelo;
int bateria = 100;

// metodo

void ligar(){
    System.out.println("o celular " + modelo + "esta ligado!");
}

void desligar(){
    System.out.println("o celular "  +  modelo  +  " esta desligado!");
}

// logica para consumo de bateria

void usar(int consumo){
    if(bateria - consumo >= 0  || bateria < 100){
        bateria -= consumo;
        System.out.println("o celular nao foi usado " + bateria + "%");
    }else{
        System.out.println("bateria é insuficiente!");
    }
}









}
