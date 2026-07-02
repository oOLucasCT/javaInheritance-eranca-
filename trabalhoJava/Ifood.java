import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ifood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao iFood ===");
        System.out.println("1. Pizza (Comida) - R$ 70,00");
        System.out.println("2. Coca-cola (Bebida) - R$ 9,00");
        System.out.println("3. Brigadeiro (Doce) - R$ 10,00");
        
              
       for( int i = 0; i < 3; i++){
                System.out.print("\nDigite o numero para fazer o pedido: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int qtd = scanner.nextInt();
       

        String nome = "";
        double valor = 0.0;

        if (opcao == 1) { nome = "Pizza"; valor = 70.00; }
        else if (opcao == 2) { nome = "Coca-cola"; valor = 9.00; }
        else if (opcao == 3) { nome = "Brigadeiro"; valor = 10.00; }
        
        // O switch roda aqui 
        Pedido pedidoEscolhido = Main.criarPedido(opcao, opcao, nome, valor, qtd);
        
        if (pedidoEscolhido != null) {
            pedidoEscolhido.exibirDados();
        } else {
            System.out.println("Opção inválida.");
            JOptionPane.showMessageDialog( null, " ERRO: Digite somente UM numero relacionado ao pedido que deseja e precione a tecla 'ENTER', na proxima opcão digite a quantidade e precione a tecla 'ENTER' (SEM LETRAS OU CARACTERES ESPECIAIS)");
        }
       }
        scanner.close();
    
    }
}