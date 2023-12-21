package projetolp1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProjetoLP1 {


    public static void main(String[] args) {
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
            System.out.println("4. Sair");

            // Ler a escolha do usuário
            System.out.print("Digite sua escolha (1-4): ");
            int escolha = scanner.nextInt();

            // Consumir a quebra de linha pendente após ler o inteiro
            scanner.nextLine();

            // Executar a opção escolhida usando switch-case
            switch (escolha) {
                case 1:
                    System.out.println("\nVoce escolheu a Opcao 1.");
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
                    System.out.println("Voce escolheu a Opcao 2.");
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
                    System.out.println("Voce escolheu a Opcao 3.");
                    System.out.println(estoque.toString());
                    break;
                case 4:
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

    

