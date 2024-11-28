import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando as instâncias dos animais
        Cachorro cachorro1 = new Cachorro("Max", 2, "Preto");
        Cavalo cavalo1 = new Cavalo("Capitão", 5, "Marrom");
        Passaro passaro1 = new Passaro("Chico", 3, "Marrom");

        // Criando o comprador
        Comprador comprador = new Comprador("Claudiao");

        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            // Exibindo opções de escolha do animal
            System.out.println("Escolha o animal para ver as informações:");
            System.out.println("1 - Cachorro");
            System.out.println("2 - Cavalo");
            System.out.println("3 - Pássaro");
            System.out.println("4 - Fim da compra");

            escolha = scanner.nextInt();

            try {
                switch (escolha) {
                    case 1:
                        cachorro1.escolheRaca("src/Racas/cachorros.txt");
                        cachorro1.mostrainfo();
                        cachorro1.exibirNivelTreinamento();
                        comprador.registrarCompra(cachorro1); // Registrar a compra do cachorro
                        cachorro1.emitirsom();
                        break;

                    case 2:
                        cavalo1.escolheRaca("src/Racas/cavalos.txt");
                        cavalo1.mostrainfo();
                        cavalo1.exibirVelocidade();
                        comprador.registrarCompra(cavalo1); // Registrar a compra do cavalo
                        cavalo1.emitirsom();
                        break;

                    case 3:
                        passaro1.escolheRaca("src/Racas/passaros.txt");
                        passaro1.mostrainfo();
                        passaro1.exibirTamanhoAsa();
                        comprador.registrarCompra(passaro1); // Registrar a compra do pássaro
                        passaro1.emitirsom();
                        passaro1.espaco();
                        break;

                    case 4:
                        System.out.println("Fim da compra.");
                        comprador.exibirTotalCompras(); // Exibe o total de compras realizadas
                        break;

                    default:
                        throw new OpcaoInvalidaException("Opção inválida! Escolha entre 1, 2, 3 ou 4.");
                        //System.out.println("Opção inválida! Escolha entre 1, 2, 3 ou 4.");

                }
            } catch (OpcaoInvalidaException e) {
                e.printStackTrace();
                //System.out.println(e.getMessage());
            }
        } while (escolha != 4);

        scanner.close();
    }
}
