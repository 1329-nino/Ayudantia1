public class Banco {
    public static void main(String[] args) {
        mostrarCreditoCalculado(1000000, 10);
        mostrarCreditoCalculado(500000, 25);
        mostrarCreditoCalculado(2500000, 20);
    }

    public static int calcularCreditoCaso1(int credito, int cuotas) {

        if (1 <= cuotas && cuotas <= 12) {
            return (int) (credito + credito * 0.25);
        }
        if (12 < cuotas && cuotas <= 23) {
            return (int) (credito + credito * 0.3);
        }
        return (int) (credito + credito * 0.35);
    }

    public static int calcularCreditoCaso2(int credito, int cuotas) {

        if (1 <= cuotas && cuotas <= 12) {
            return (int) (credito + credito * 0.15);
        }
        if (12 < cuotas && cuotas <= 23) {
            return (int) (credito + credito * 0.2);
        }
        return (int) (credito + credito * 0.25);
    }

    public static int pedirCredito(int credito, int cuotas) {

        if (cuotas == 0) {
            return 0;
        }

        if (0 < credito && credito <= 1000000) {
            return calcularCreditoCaso1(credito, cuotas);

        }
        if (1000000 < credito && credito < 5000000) {
            return calcularCreditoCaso2(credito, cuotas);

        }
        return 0;
    }

    public static void mostrarCreditoCalculado(int credito, int cuotas) {

        int creditoTotal = pedirCredito(credito, cuotas);

        if (cuotas == 0) {
            System.err.println("No ha pedido un credito");
        }
        System.out.println("Monto total a pagar: " + creditoTotal);
        System.out.println("la cuota mensual es: "+calcularCuotaMensual(creditoTotal,cuotas));
    }

    public static int calcularCuotaMensual(int creditoTotal, int cuotas) {
        return creditoTotal / cuotas;
    }

}
