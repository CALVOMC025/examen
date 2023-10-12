package examen;

public class Pedido {
    private String primerPlato;
    private String segundoPlato;
    private String bebida;
    private String postre;

    public Pedido(String primerPlato, String segundoPlato, String bebida, String postre) {
        this.primerPlato = primerPlato;
        this.segundoPlato = segundoPlato;
        this.bebida = bebida;
        this.postre = postre;
    }

    public Pedido(String primerPlato, String bebida) {
        this(primerPlato, null, bebida, null);
    }

    public Pedido(String primerPlato, String segundoPlato, String bebida) {
        this(primerPlato, segundoPlato, bebida, null);
    }

    public double calcularValorPedido() {
        double valor = 0;
        if (primerPlato != null) {
            valor += 10.0; // Precio del primer plato
        }
        if (segundoPlato != null) {
            valor += 15.0; // Precio del segundo plato
        }
        if (bebida != null) {
            valor += 5.0; // Precio de la bebida
        }
        if (postre != null) {
            valor += 8.0; // Precio del postre
        }
        return valor;
    }
}
