package projetolp1;

import java.util.Scanner;

public class Pereciveis extends Produto{
    private int validadeEmMeses;
    private double valorTotalProduto;

    public Pereciveis(Scanner scanner) {
        super(scanner);
        System.out.println("Validade em meses do produto: ");
        this.validadeEmMeses = scanner.nextInt();
        this.valorTotalProduto = this.getQuantidadeProduto()*this.getPreco();
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

    @Override
    public String toString() {
        return this.getCodigo()+ "-" + this.getNome() + "\nQuantidade: " + this.getQuantidadeProduto()+"\nValidade Em Meses: " + validadeEmMeses + "\nValor Unitário: R$" + this.getPreco() +"\nValor Total do Produto: R$" + valorTotalProduto + "\n-----------------------------------";
    }
    
}
