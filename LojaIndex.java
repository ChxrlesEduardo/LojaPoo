import java.util.Scanner;
import java.util.Random;

// Definição da classe LojaIndex
public class LojaIndex {
    
    // Método principal
    public static void main(String[] args) {
        // Criação de um objeto Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);
        // Criação de um objeto da classe Produtos
        Produtos prod_1 = new Produtos();
        // Criação de um objeto Random para geração de IDs aleatórios
        Random random = new Random();

        // Loop infinito para manter o programa em execução até que o usuário escolha encerrar
        while (true) {
            // Exibição do menu de opções
            System.out.println("Selecione a opção que deseja realizar: \n" +
                               "1 - Cadastro de produtos  \n" +
                               "2 - Visualizar produtos  \n" +
                               "Exit - Encerrar programa");
            // Leitura da escolha do usuário
            String escolha = scanner.next();

            // Switch para lidaTr com as opções escolhidas pelo usuário
            switch (escolha) {
                case "1":
                    // Opção para cadastrar um novo produto
                    System.out.println("Insira o nome do produto: ");
                    String nome = scanner.next();
                    System.out.println("Insira o tipo de produto: ");
                    String tipo = scanner.next();
                    System.out.println("Insira o preço do produto: ");
                    Double preco = scanner.nextDouble();
                    // Gerar um ID aleatório
                    int randomID = random.nextInt(1000); // Altere 1000 para o intervalo desejado
                    // Criar um novo objeto Produtos com os detalhes inseridos e o ID aleatório
                    Produtos novoProduto = new Produtos(randomID, nome, tipo, preco);
                    // Adicionar o novo produto à lista de produtos
                    prod_1.adicionar_na_lista(novoProduto);
                    prod_1.exportarParaExcel("C:\\Users\\COMIN\\Desktop\\LojaPoo\\LojaPoo\\Produtos.csv");
                    break;

                case "2":
                    // Opção para visualizar todos os produtos cadastrados
                    //prod_1.visualizar_produtos();
                    prod_1.visualizarProdutosDoExcel("C:\\Users\\COMIN\\Desktop\\LojaPoo\\LojaPoo\\Produtos.csv");
                    break;
                case "Exit":
                    // Opção para encerrar o programa
                    System.out.println("Programa encerrado...");
                    // Fechar o scanner para liberar recursos
                    scanner.close();
                    // Retornar para encerrar o método main e, consequentemente, o programa
                    return;
                default:
                    // Mensagem de erro para escolhas inválidas
                    System.out.println("Insira uma opção válida...");
                    break;
            }
        }
    }
}
