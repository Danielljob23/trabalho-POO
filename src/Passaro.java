public class Passaro extends Animal implements Habitate {
    private double tamanhoAsa;
    public Passaro(String nome, int idade, String cor) {
        super(nome, idade, cor);
        this.tamanhoAsa = 0.25; // Tamanho da asa padrão em metros
        this.preco = 150;

    }
    public void setTamanhoAsa(double tamanho) {
        this.tamanhoAsa = tamanho;

    }

    public void exibirTamanhoAsa() {
        System.out.println("O tamanho da asa do pássaro é: " + tamanhoAsa + " metros");

    }
    // Implementação do método `espaco` da interface `Habitate`
    @Override
    public void espaco() {
        System.out.println("O passáro Voa");

    }
    // Implementação do método `emitirsom` específico para pássaros
    @Override
    public void emitirsom() {
        System.out.println("O passaro faz piu-piu");

    }

    @Override
    public void Calculapreco() {
        preco = 150;

        System.out.println("O preço final do " + nome + " é: R$ " + preco);
    }
}

