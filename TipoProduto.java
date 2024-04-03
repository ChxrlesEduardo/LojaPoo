public class TipoProduto extends Produtos {

    private String nomeDoProduto;
    private String tipoDoProduto;

    public TipoProduto(Integer ID, String nome, String tipo, Double preco, String nomeDoProduto, String tipoDoProduto) {
        super(ID, nome, tipo, preco);
        this.nomeDoProduto = nomeDoProduto;
        this.tipoDoProduto = tipoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getTipoDoProduto() {
        return tipoDoProduto;
    }

    public void setTipoDoProduto(String tipoDoProduto) {
        this.tipoDoProduto = tipoDoProduto;
    }
}
