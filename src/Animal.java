import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Animal {
    protected String nome;
    protected String cor;
    protected double preco;
    protected int idade;
    protected String raca;

    // Construtor que inicializa nome, cor e idade
    public Animal(String nome, int idade, String cor) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.preco =0;// Preço base, pode ser modificado nas subclasses


    }

    //Método para selecionar a raça do animal a partir de um arquivo
    public void escolheRaca(String caminho) {
        Path arquivo = Paths.get(caminho);
        List<String> leituras = new ArrayList<>(); //permite ao usuário escolher a raça do animal a partir de um arquivo de texto

        try {
            leituras = Files.readAllLines(arquivo); // manipula arquivo txt(ler as linhas do arquivo)
        } catch (IOException e) { // Exceção que pode ser lançada em operações de entrada/saída, como leitura de arquivos.
            e.printStackTrace(); // indica quem chamou quem e onde aconteceu o erro: rastro da pilha(caminho)
            //e.getmensager(mostra so a msg de erro)
        }

        // Exibe as opções de raças e permite ao usuário escolher
        System.out.println("As raças são: ");
        for (int i = 0; i < leituras.size(); i++) {
            System.out.println("Raça " + (i + 1) + ": " + leituras.get(i));
        }

        //Escolher a raça
        Scanner sc = new Scanner(System.in);
        boolean sucesso = false;
        do {
            System.out.println("Escolha sua raça de acordo com o número correspondente: ");

            int x = sc.nextInt(); //lê um número inteiro digitado pelo usuário. O número que o usuário digitar deve corresponder ao número de uma raça

            try {
                raca = leituras.get(x - 1);// Define a raça escolhida
                System.out.println(raca + " foi escolhida");
                sucesso = true;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro! Essa raça não existe");
            }

        }while (sucesso == false);

    }

    public void mostrainfo() {

        System.out.println("O nome do animal é: " + this.nome);
        System.out.println("A cor do animal é: " + this.cor);
        System.out.println("Preço do animal : " + preco);
        System.out.println("A idade do animal é : " + this.idade + " anos ");
        System.out.println("Raça é: " + raca);
    }

    public abstract void Calculapreco();

    public abstract void emitirsom();
}