class Comida extends Pedido {
    public Comida(int codigo, String nome, double valorUnitario, int quantidade) {
        super(codigo, nome, valorUnitario, quantidade);
    }

    @Override
    public double calcularFrete() {
        return (getValorUnitario() * getQuantidade()) * 0.01;
    }
}

class Bebida extends Pedido {
    public Bebida(int codigo, String nome, double valorUnitario, int quantidade) {
        super(codigo, nome, valorUnitario, quantidade);
    }

    @Override
    public double calcularFrete() {
        return (getValorUnitario() * getQuantidade()) * 0.01;
    }
}

class Doce extends Pedido {
    public Doce(int codigo, String nome, double valorUnitario, int quantidade) {
        super(codigo, nome, valorUnitario, quantidade);
    }

    @Override
    public double calcularFrete() {
        return (getValorUnitario() * getQuantidade()) * 0.02;
    }
}