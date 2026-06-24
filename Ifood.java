public class Ifood{
    public static void main(String[]args){

        Pedido pedido1 = new Comida ( "Pizza", 7000);
        Pedido pedido2 = new Bebida ( "Coca-cola", 9000);
        Pedido pedido3 = new Doce ("Brigadeiro", 10000);

        pedido1.frete();
        System.out.println();
        pedido2.frete();
        System.out.println();
        pedido3.frete();
    }
}

    abstract class Pedido {
        private String nome;
        private double valor;
        

        public Pedido(String nome, double valor){
            this.nome = nome;
            this.valor = valor;

        }

        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }

        public double getValor(){
            return valor;
        }
        public void setValor(double valor){
            this.valor = valor;
        }

        public abstract void frete();

    }

    class Comida extends Pedido{

        public Comida(String nome, double valor){
            super(nome, valor);
        }

        @Override
        public void frete(){
            double rendimento = getValor() * 0.01;
          
            System.out.println("");
            System.out.println("Pedido: " + getNome());
            System.out.println("Valor total: R$" + getValor());
            System.out.println("Valor do frete: R$" + rendimento);
            

        }

    }


    class Bebida extends Pedido{

        public Bebida(String nome, double valor){
            super(nome, valor);
        }

        @Override
        public void frete(){
            double rendimento = getValor() * 0.01;
          
            System.out.println("");
            System.out.println("Pedido: " + getNome());
            System.out.println("Valor total: R$" + getValor());
            System.out.println("Valor do frete: R$" + rendimento);
            

        }
    }

    class Doce extends Pedido{
        

        public Doce(String nome, double valor){
            super(nome, valor);
        }

        @Override
        public void frete(){
            double rendimento = getValor() * 0.02;
          
            System.out.println("");
            System.out.println("Pedido: " + getNome());
            System.out.println("Valor total: R$" + getValor());
            System.out.println("Valor do frete: R$" + rendimento);
        

        }
    }