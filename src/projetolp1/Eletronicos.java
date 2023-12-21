package projetolp1;

import java.util.Scanner;

public class Eletronicos extends Produto{
    private String estado;
    private double valorTotalProduto;

    public Eletronicos(Scanner scanner) {
        super(scanner);
        System.out.println("Estado do produto: ");
        this.estado = scanner.nextLine();
        this.valorTotalProduto = this.getPreco()*this.getQuantidadeProduto();
    }

   

    @Override
    public String toString() {
        return this.getNome() + "--" +this.getCodigo()+"\nEstado do Produto: " + estado +  "\nValor Unitário: R$" + this.getPreco() + "\nValor Total do Produto: " + valorTotalProduto + "\n-----------------------------------";
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
