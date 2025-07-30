import br.com.alura.Conversor.ConversorMoeda;

// Main.java
public class Main {
    public static void main(String[] args) {

        ConversorMoeda meuConversor = new ConversorMoeda();


        double valorParaConverter1 = 100.0;
        double valorConvertido1 = meuConversor.converterDolarParaReal(valorParaConverter1);
        System.out.println(valorParaConverter1 + " dólares equivalem a " + valorConvertido1 + " reais.");

        System.out.println("------------------------------------");


        double valorParaConverter2 = 75.50;
        double valorConvertido2 = meuConversor.converterDolarParaReal(valorParaConverter2);
        System.out.println(valorParaConverter2 + " dólares equivalem a " + valorConvertido2 + " reais.");

        System.out.println("------------------------------------");


        double valorParaConverter3 = -20.0;
        double valorConvertido3 = meuConversor.converterDolarParaReal(valorParaConverter3);
        System.out.println(valorParaConverter3 + " dólares equivalem a " + valorConvertido3 + " reais.");
    }
}