package projetolp1;

public class Estoque {
    private int quantidadeMax;
    private int quantidadeTotal;
    private double valorEstoque;

    public Estoque() {
        this.quantidadeMax = 1000;
        this.quantidadeTotal = 0;
        this.valorEstoque = 0.0;
      
    }
    public void statusEstoque() {
        System.out.println("---------------------------------------------");
        System.out.println("      INFORMACOES DO ESTOQUE     ");
        System.out.println("Quantidade Maxima do Estoque: " + this.quantidadeMax);
        System.out.println("Quantidade no Estoque Atual: " + this.quantidadeTotal);
        System.out.println("Valor Total do Estoque: R" + this.valorEstoque);
    }
    
    

    public int getQuantidadeMax() {
        return quantidadeMax;
    }

    public void setQuantidadeMax(int quantidadeMax) {
        this.quantidadeMax = quantidadeMax;
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(int quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public double getValorEstoque() {
        return valorEstoque;
    }

    public void setValorEstoque(double valorEstoque) {
        this.valorEstoque = valorEstoque;
    }
    // Adiciona ao estoque a quantidade e o valor total do produto
    public void adicionarAoEstoque(Eletronicos x){
        if(this.quantidadeTotal == this.quantidadeMax){
            System.out.println("Quantidade maxima do estoque atingida, nao é possivel adicionar!");
        }else if(this.quantidadeTotal < this.quantidadeMax){
            this.quantidadeTotal += x.getQuantidadeProduto();
            if(this.quantidadeTotal <= this.quantidadeMax){
                System.out.println("Adicionado com Sucesso!");
                this.valorEstoque+=x.getValorTotalProduto();
            }else{
                this.quantidadeTotal-=x.getQuantidadeProduto();
                System.out.println("A quantidade ultrapassa o maximo do estoque");
            }
        }       
    }
    public void buscarEstoque(Eletronicos x){
        System.out.println("---------------------------------------------");
        System.out.println("DETALHES DO PRODUTO ELETRONICO");
        System.out.println("Fornecedor: " + x.getFornecedor());
        System.out.println("Nome do Produto: " + x.getNome());
        System.out.println("Estado dos produtos: " + x.getEstado());
        System.out.println("Preco: R$" + x.getPreco());
        System.out.println("Quantidade desse produto no estoque: " + x.getQuantidadeProduto());
        System.out.println("Valor Total: R$" + x.getValorTotalProduto());
        
    }
    
    public void adicionarAoEstoque(Pereciveis x){
        if(this.quantidadeTotal == this.quantidadeMax){
            System.out.println("Quantidade maxima do estoque atingida, nao é possivel adicionar!");
        }else if(this.quantidadeTotal < this.quantidadeMax){
            this.quantidadeTotal += x.getQuantidadeProduto();
            if(this.quantidadeTotal <= this.quantidadeMax){
                System.out.println("Adicionado com Sucesso!");
                this.valorEstoque+=x.getValorTotalProduto();
            }else{
                this.quantidadeTotal-=x.getQuantidadeProduto();
                System.out.println("A quantidade ultrapassa o maximo do estoque");
            }
        }       
    }
    public void buscarEstoque(Pereciveis x){
        System.out.println("---------------------------------------------");
        System.out.println("DETALHES DO PRODUTO PERECIVEL");
        System.out.println("Fornecedor: " + x.getFornecedor());
        System.out.println("Nome do Produto: " + x.getNome());
        System.out.println("Validade: " + x.getValidadeEmMeses());
        System.out.println("Preco: R$" + x.getPreco());
        System.out.println("Quantidade desse produto no estoque: " + x.getQuantidadeProduto());
        System.out.println("Valor Total: R$" + x.getValorTotalProduto());
        
    }
    
}
