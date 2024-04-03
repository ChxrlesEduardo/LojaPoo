import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.tools.JavaFileManager.Location;

import java.util.ArrayList;




//Definição da classe Produtos
public class Produtos {

    // Atributos da classe
    private Integer ID;        // Identificador único do produto
    private String nome;       // Nome do produto
    private String tipo;       // Tipo do produto
    private Double preco;      // Preço do produto

    // Lista para armazenar os produtos
    ArrayList<Produtos> lista = new ArrayList<>();

    // Construtores da classe
    // Construtor vazio
    public Produtos() {

    }

    // Construtor com parâmetros para ID, nome, tipo e preço
    public Produtos(Integer ID, String nome, String tipo, Double preco) {
        this.ID = ID;
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    // Métodos de acesso aos atributos (getters e setters)
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // Método para adicionar um produto à lista
    public void adicionar_na_lista(Produtos prod) {
        lista.add(prod);
    }

    // Método para verificar se um ID já existe na lista
    public boolean verificarIdExistente(int id) {
        for (Produtos produto : lista) {
            if (produto.getID() == id) {
                return true;
            }
        }
        return false;
    }

    // Método para visualizar todos os produtos na lista
    public void visualizar_produtos() {
        if (lista.isEmpty()) {
            System.out.println("Não há produtos para serem exibidos.");
        } else {
            System.out.println("Lista de produtos:");
            for (int i = 0; i < lista.size(); i++) {
                Produtos prod = lista.get(i);
                System.out.println(" -- Produto de número #" + (i + 1));
                System.out.println("ID do produto: " + prod.getID());
                System.out.println("Nome do produto: " + prod.getNome());
                System.out.println("Tipo do produto: " + prod.getTipo());
                System.out.println("Preço do produto R$: " + prod.getPreco());
                System.out.println();
            }
        }
    }

    // Método para exportar os produtos para um arquivo Excel
    public void exportarParaExcel(String caminhoArquivo) {
        // Montar o texto a ser exportado para o Excel
        StringBuilder texto = new StringBuilder();
        for (Produtos produto : lista) {
            texto.append(produto.getID()).append("\t")
                 .append(produto.getNome()).append("\t")
                 .append(produto.getTipo()).append("\t")
                 .append(produto.getPreco()).append("\n");
        }

        // Chamar o método escrever da classe ExcelWriter para escrever o texto no arquivo Excel
        ExcelWriter.escrever(caminhoArquivo, texto.toString());
    }

    public void visualizarProdutosDoExcel(String string) {
        Location("C:\\Users\\COMIN\\Desktop\\LojaPoo\\LojaPoo\\Produtos.csv");
        }

    private void Location(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '\"C:\\\\Users\\\\COMIN\\\\Desktop\\\\LojaPoo\\\\LojaPoo\\\\Produtos.csv\"'");
    }
    }
