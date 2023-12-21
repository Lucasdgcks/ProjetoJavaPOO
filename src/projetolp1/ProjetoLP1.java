package projetolp1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//import javax.swing.*;
public class ProjetoLP1 {


    public static void main(String[] args) {
        //JFrame janela = new JFrame("DANTAS COMPANY");
        //janela.setSize(1000, 700);
        //janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JButton botao[] = new JButton[6];
        //janela.add(botao[0] = new JButton("1. Cadastrar novo produto ELETRONICO"));
        //janela.setVisible(true);
        Scanner scanner = new Scanner(System.in);
        Eletronicos e[] = new Eletronicos[10];
        Pereciveis p[] = new Pereciveis[10];
        Estoque estoque = new Estoque();
        int cont = 0;
        int c = 0;
        while (true) {
            // Mostrar as opções do menu para o usuário
            System.out.println("---------MENU---------");
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Cadastrar novo produto ELETRONICO");
            System.out.println("2. Cadastrar novo produto PERECIVEL");
            System.out.println("3. Vizualizar Estoque");
            System.out.println("4. Retirar produto");
            System.out.println("5. Sair");

            // Ler a escolha do usuário
            System.out.print("Digite sua escolha (1 a 5): ");
            int escolha = scanner.nextInt();

            // Consumir a quebra de linha pendente após ler o inteiro
            scanner.nextLine();

            // Executar a opção escolhida usando switch-case
            switch (escolha) {
                case 1:
                    System.out.println("\nCadastre o produto Eletronico:");
                    e[cont] = new Eletronicos(scanner);
                    estoque.adicionarAoEstoque(e[cont]);
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt", true))) {//escreve no arquivo, esse true significa que não vai sobreescerver e sim add
                            writer.write(e[cont].toString());
                            writer.newLine(); 
                     } catch (IOException erro) {
                            System.err.println("Erro ao escrever no arquivo: " + erro.getMessage());
                        }
                            System.out.println("Dados foram escritos no arquivo 'dados.txt'.");
                    cont++;
                    break;
                case 2:
                    System.out.println("\nCadastre o produto Perecivel:");
                    p[c] = new Pereciveis(scanner);
                    estoque.adicionarAoEstoque(p[c]);
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt", true))) {
                            writer.write(p[c].toString());
                            writer.newLine(); 
                     } catch (IOException erro) {
                            System.err.println("Erro ao escrever no arquivo: " + erro.getMessage());
                        }
                            System.out.println("Dados foram escritos no arquivo 'dados.txt'.");
                    c++;
                    break;
                case 3:
                    System.out.println("Mostrando dados do Estoque.");
                    System.out.println(estoque.toString());
                    break;
                case 4:
                    System.out.println("Digite o codigo do produto para retirar.");
                    
                case 5:
                    System.out.println("Encerrando o programa. Adeus!");
                    // Sair do loop e encerrar o programa
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
        
        
}

    

