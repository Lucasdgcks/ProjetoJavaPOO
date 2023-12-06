package projetolp1;

public class Eletronicos extends Produto{
    private String estado;
    private double valorTotalProduto;

    public Eletronicos(int codigo, String nome, String fornecedor, double preco, int quantidade, String estado) {
        super(codigo, nome, fornecedor, preco, quantidade);
        this.estado = estado;
        this.valorTotalProduto = this.getPreco()*this.getQuantidadeProduto();
    }

    
    
    public void status(){
        System.out.println("DETALHES DO PRODUTO ELETRONICO");
        System.out.println("Fornecedor: " + this.getFornecedor());
        System.out.println("Nome do Produto: " + this.getNome());
        System.out.println("Estado dos produtos: " + this.getEstado());
        System.out.println("Preco: R$" + this.getPreco());
        System.out.println("Valor Total: R$" + this.valorTotalProduto);
        
    }
    
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValorTotalProduto() {
        return valorTotalProduto;
    }

    public void setValorTotalProduto(double valorTotalProduto) {
        this.valorTotalProduto = valorTotalProduto;
    }
    
    
}
