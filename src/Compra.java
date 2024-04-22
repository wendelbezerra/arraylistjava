public class Compra implements Comparable<Compra> {
    private String descrcao;
    private double valor;

    public Compra(String descrcao, double valor) {
        this.descrcao = descrcao;
        this.valor = valor;
    }

    public String getDescrcao() {
        return descrcao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: descrição = " + descrcao +
                ", valor = " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
