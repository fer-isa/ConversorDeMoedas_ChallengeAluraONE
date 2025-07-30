package br.com.alura.Conversor;

public class ConversorMoeda implements ConversaoFinanceira {

    private static final double taxaDolarParaReal = 5.25;

    @Override
    public double converterDolarParaReal(double valorDolar) {

        if (valorDolar < 0) {
            System.out.println("Aviso: O valor em dólar não pode ser negativo. Retornando 0.");
            return 0;
        }

        return valorDolar * taxaDolarParaReal;
    }
}

