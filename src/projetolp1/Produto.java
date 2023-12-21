package projetolp1;
import java.util.Scanner;
public abstract class Produto {
    private int codigo;
    private String nome;
    private String fornecedor;
    private double preco;
    private int quantidadeProduto;

    public Produto(Scanner scanner) {
        System.out.println("Crie o codigo do produto: ");
        this.codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nome do produto: ");
        this.nome = scanner.nextLine();
        System.out.println("Preco do produto: ");
        this.preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Fornecedor do produto: ");
        this.fornecedor = scanner.nextLine();
        System.out.println("Qauntidade total do produto: ");
        this.quantidadeProduto = scanner.nextInt();
        scanner.nextLine();
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
