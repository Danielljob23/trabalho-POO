public class Cachorro extends Animal {
    private String nivelTreinamento;

    public Cachorro(String nome, int idade, String cor) {
        super(nome, idade, cor);
        this.nivelTreinamento = "Iniciante"; // Valor padrão
        this.preco = 1000; // Preço base
    }

    public void setNivelTreinamento(String nivel) {
        this.nivelTreinamento = nivel;

    }

    public void exibirNivelTreinamento() {
        System.out.println("O nível de treinamento do cachorro é: " + nivelTreinamento);
    }

    @Override
    public void emitirsom() {
        System.out.println("O cachorro faz AU-AU");
    }

    @Override
    public void Calculapreco() {
        // preço final do cachorro
        preco = 1000;
        System.out.println("O preço final do " + nome + " é: R$ " + preco);
    }
}
