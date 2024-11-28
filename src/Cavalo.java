public class Cavalo extends Animal {
    private double velocidade;

    public Cavalo(String nome, int idade, String cor) {
        super(nome, idade, cor);
        this.velocidade = 40.0; // Velocidade padrão em km/h
        this.preco = 10000;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
        
    }

    public void exibirVelocidade() {
        System.out.println("A velocidade do cavalo é: " + velocidade + " km/h");

    }

    @Override
    public void emitirsom() {
        System.out.println("O cavalo Relincha");
    }

    @Override
    public void Calculapreco() {
        preco = 10000; //Preço cavalo
        System.out.println("O preço final do " + nome + " é: R$ " + preco);
    }
}
