public class veiculo {
    // constroi uma sub class de veiculos para caminhos
    private int passageiros; 
    private int combustgalao;
    private int kpg;

    // construtor para veiculo
    public veiculo(int p, int c, int k) {
        passageiros = p;
        combustgalao = c;
        kpg = k;
    }
 
    // retorna a autonomia
    int range() {
        return kpg * combustgalao;
    }

    // calcula o combustivel para deterninada distancia
    double calculaCombustivel(int kilometro) {
        return (double) kilometro / kpg;
    }

    //metodos de acesso de variaveis de distacia.
    int getpassageiros() { return passageiros; }
    void setpassageiros(int p) { passageiros = p; }

    int getcombustgalao() { return combustgalao; }
    void setcombustgalao(int c) { combustgalao = c; }

    int getkpg() { return kpg; }
    void setkpg(int k) { kpg = k; }
}

// estende veiculo para criar a especialização caminhão.
class caminhao extends veiculo {
    private int capDCarga;

    // este é o construtor para caminhao
    public caminhao(int p, int c, int k, int cap) {
        super(p, c, k);
        capDCarga = cap;
    }

    // metodos acessadores para capacidade de carga
    int getcapDCarga() { return capDCarga; }
    void setcapDCarga(int c) { capDCarga = c; }
}
    // constroi alguns caminhoes
    class caminhaodemostracao {
    public static void main(String[] args) {
        caminhao semi = new caminhao(2, 200, 7, 440000);
        caminhao caminhonete = new caminhao(3, 28, 15, 2000);

        double galoes;
        int distancia = 252;

        galoes = semi.calculaCombustivel(distancia);

        System.out.println("A semi transporta: " + semi.getcapDCarga() + " kg");
        System.out.println("Para percorrer " + distancia + " km, serão necessários " + galoes + " galões.");

        galoes = caminhonete.calculaCombustivel(distancia);

        System.out.println("A caminhonete transporta: " + caminhonete.getcapDCarga() + " kg");
        System.out.println("Para percorrer " + distancia + " km, serão necessários " + galoes + " galões.");
    }
}













     

