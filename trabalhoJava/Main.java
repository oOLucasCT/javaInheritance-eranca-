public class Main {


    public static Pedido criarPedido(int opcao, int codigo, String nome, double valorUnitario, int quantidade) {
        switch (opcao) {
            case 1: return new Comida(codigo, nome, valorUnitario, quantidade);
            case 2: return new Bebida(codigo, nome, valorUnitario, quantidade);
            case 3: return new Doce(codigo, nome, valorUnitario, quantidade);
            default: return null;
        }
    }
}
