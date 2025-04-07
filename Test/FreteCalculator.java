public class FreteCalculator {
    public double calcularFrete(double peso, double distancia) {
        if (peso <= 0 || distancia <= 0) {
            throw new IllegalArgumentException("Peso e distância devem ser maiores que zero");
        }
        return peso * 0.5 + distancia * 0.2;
    }
}