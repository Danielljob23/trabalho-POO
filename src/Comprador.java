public class Comprador {
    private String nome;
    private double totalCompras; // Para armazenar o total de compras feitas

    public Comprador(String nome) {
        this.nome = nome;
        this.totalCompras = 0.0;
    }

    // Registrar a compra de um animal
    public void registrarCompra(Animal animal) {
        animal.Calculapreco(); // Executa o cálculo do preço para o animal
        totalCompras += animal.preco; // Adiciona o preço do animal ao total de compras

    }

    // Exibir o total de compras
    public void exibirTotalCompras() {
        System.out.println("Total de compras realizadas por " + nome + ": R$ " + totalCompras);
    }
}
