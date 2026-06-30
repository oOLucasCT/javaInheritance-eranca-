public abstract class Pedido {
    private int codigo;
    private String nome;
    private double valorUnitario;
    private int quantidade; 

    public Pedido(int codigo, String nome, double valorUnitario, int quantidade) {
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;

        double TotalGeral = this.valorUnitario * this.quantidade;
        Pedido.subtotal += TotalGeral;

        this.nome = nome + " "+ nome + 1;
        Pedido.TodoNome += nome;

    }

    // Método abstrato que cada filho deve calcular 
    public abstract double calcularFrete();

    // criando uma variavel para ser "global" e poder somar o total de todos os pedidos
    public static double subtotal = 0.0;
    public static String TodoNome = "";

    public void exibirDados() {
       
        double frete = calcularFrete();
        

        System.out.println("\n=== RESUMO DO PEDIDO ===");
        System.out.println("Compra: " + quantidade + "x " + Pedido.TodoNome + "");
        System.out.printf("Frete: R$ %.2f\n", frete);
        System.out.printf("TOTAL A PAGAR: R$ %.2f\n", (Pedido.subtotal + frete));
    }

    // Getters e Setters 
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getValorUnitario() { return valorUnitario; }
    public void setValorUnitario(double valorUnitario) { this.valorUnitario = valorUnitario; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
}