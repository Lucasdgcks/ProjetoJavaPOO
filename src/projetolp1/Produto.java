package projetolp1;

public abstract class Produto {
    private int codigo;
    private String nome;
    private String fornecedor;
    private double preco;
    private int quantidadeProduto;

    public Produto(int codigo, String nome, String fornecedor, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.quantidadeProduto = quantidade;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    
    
    
}
