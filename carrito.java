public class carrito {
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        int suma = calc.suma(43, 79);
        System.out.println("Resultado: " + suma);
        calc.division(15, 0);
    }
}
