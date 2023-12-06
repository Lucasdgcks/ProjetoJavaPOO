package projetolp1;

public class Pereciveis extends Produto{
    private int validadeEmMeses;
    private double valorTotalProduto;

    public Pereciveis(int codigo, String nome, String fornecedor, double preco, int quantidade, int validadeEmMeses) {
        super(codigo, nome, fornecedor, preco, quantidade);
        this.validadeEmMeses = validadeEmMeses;
        this.valorTotalProduto = this.getPreco()*this.getQuantidadeProduto();
    }

    public double getValorTotalProduto() {
        return valorTotalProduto;
    }

    public void setValorTotalProduto(double valorTotalProduto) {
        this.valorTotalProduto = valorTotalProduto;
    }

    public int getValidadeEmMeses() {
        return validadeEmMeses;
    }

    public void setValidadeEmMeses(int validadeEmMeses) {
        this.validadeEmMeses = validadeEmMeses;
    }
}
