package examen;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Sopa", "Pollo a la parrilla", "Agua mineral", "Tarta de manzana");
        Pedido pedido2 = new Pedido("Ensalada", "Refresco de cola");
        Pedido pedido3 = new Pedido("Pizza", "Lasagna", "Cerveza", "Helado de vainilla");

        System.out.println("Valor del pedido 1: $" + pedido1.calcularValorPedido());
        System.out.println("Valor del pedido 2: $" + pedido2.calcularValorPedido());
        System.out.println("Valor del pedido 3: $" + pedido3.calcularValorPedido());
    }
}

