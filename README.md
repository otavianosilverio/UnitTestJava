Testes Unitários em Java — Classe Calculadora
Este repositório contém uma implementação simples de uma calculadora em Java, com operações básicas: soma, subtração, multiplicação e divisão. A classe Calculadora serve como base para a criação e execução de testes unitários, um conceito fundamental em desenvolvimento de software para garantir que cada unidade do código funcione conforme esperado.

📂 Classe: Calculadora.java
java
Copiar
Editar
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return (double) a / b;
    }
}
✅ Objetivo dos Testes
Os testes unitários validam o comportamento dos métodos da classe Calculadora, incluindo:

somar(int a, int b)

subtrair(int a, int b)

multiplicar(int a, int b)

dividir(int a, int b)

Além disso, também testamos o tratamento de exceção no método dividir(), que lança uma IllegalArgumentException ao tentar dividir por zero.

🧪 Exemplo de Testes com JUnit
java
Copiar
Editar
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    public void testSubtrair() {
        assertEquals(1, calc.subtrair(3, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(4, 2));
    }

    @Test
    public void testDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }
}
📌 Requisitos
Java 8 ou superior

Biblioteca de testes JUnit 5

🚀 Como Executar os Testes
Se estiver utilizando uma IDE como IntelliJ ou Eclipse:

Clique com o botão direito na classe CalculadoraTest

Selecione Run 'CalculadoraTest'
