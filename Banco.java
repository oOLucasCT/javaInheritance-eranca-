public class Banco{
    public static void main(String[]args){

        ContaBancaria contaBancaria1 = new Corrente ( "Carlos", 7000, 2000);
        ContaBancaria contaBancaria2 = new Poupanca ( "Ana", 9000, 3000);
        ContaBancaria contaBancaria3 = new CDB ("João", 10000, 5000);

        contaBancaria1.calculaRendimento();
        System.out.println();
        contaBancaria2.calculaRendimento();
        System.out.println();
        contaBancaria3.calculaRendimento();
    }
}

    abstract class ContaBancaria {
        private String titular;
        private double saldo;
        private double fatura;

        public ContaBancaria(String titular, double saldo, double fatura){
            this.titular = titular;
            this.saldo = saldo;
            this.fatura = fatura;

        }

        public String getTitular(){
            return  titular;
        }
        public void setTitular(String titular){
            this.titular = titular;
        }

        public double getSaldo(){
            return saldo;
        }
        public void setSaldo(double saldo){
            this.saldo = saldo;
        }

        public double getFatura(){
        return fatura;
        }
        public void setFatura(double fatura){
            this.fatura = fatura;
        }

        public abstract void calculaRendimento();

    }

    class Corrente extends ContaBancaria{

        public Corrente(String titular, double saldo, double fatura){
            super(titular, saldo, fatura);
        }

        @Override
        public void calculaRendimento(){
            double rendimento = getSaldo() * 0.01;
          
            System.out.println("Conta: Corrente");
            System.out.println("Titular: " + getTitular());
            System.out.println("Saldo: R$" + getSaldo());
            System.out.println("Rendimento da conta: R$" + rendimento);
            System.out.println("Fatura: R$" + getFatura());

        }

    }


    class Poupanca extends ContaBancaria{

        public Poupanca(String titular, double saldo, double fatura){
            super(titular, saldo, fatura);
        }

        @Override
        public void calculaRendimento(){
            double rendimento = getSaldo() * 0.01;
          
            System.out.println("Conta: Poupança");
            System.out.println("Titular: " + getTitular());
            System.out.println("Saldo: R$" + getSaldo());
            System.out.println("Rendimento da conta: R$" + rendimento);
            System.out.println("Fatura: R$" + getFatura());

        }
    }

    class CDB extends ContaBancaria{

        public CDB(String titular, double saldo, double fatura){
            super(titular, saldo, fatura);
        }

        @Override
        public void calculaRendimento(){
            double rendimento = getSaldo() * 0.02;
          
            System.out.println("Conta: CDB");
            System.out.println("Titular: " + getTitular());
            System.out.println("Saldo: R$" + getSaldo());
            System.out.println("Rendimento da conta: R$" + rendimento);
            System.out.println("Fatura: R$" + getFatura());

        }
    }