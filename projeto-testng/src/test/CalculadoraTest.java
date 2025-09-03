package com.facul;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculadoraTest {

    private Calculadora calc;

    // A anotação @BeforeClass faz com que este método seja executado uma vez antes de todos os testes nesta classe.
    @BeforeClass
    public void setup() {
        // Prepara o ambiente de teste, criando a instância da classe a ser testada.
        System.out.println("Iniciando os testes da Calculadora...");
        calc = new Calculadora();
    }

    // A anotação @Test marca este método como um caso de teste.
    @Test
    public void testSomar() {
        System.out.println("Executando testSomar...");
        int resultado = calc.somar(5, 3);
        // Assert.assertEquals verifica se o resultado esperado é igual ao resultado obtido.
        Assert.assertEquals(resultado, 8, "A soma de 5 + 3 deveria ser 8");
    }

    @Test
    public void testSubtrair() {
        System.out.println("Executando testSubtrair...");
        int resultado = calc.subtrair(10, 4);
        Assert.assertEquals(resultado, 6, "A subtração de 10 - 4 deveria ser 6");
    }

    @Test
    public void testSomarComNumerosNegativos() {
        System.out.println("Executando testSomarComNumerosNegativos...");
        int resultado = calc.somar(-5, -5);
        Assert.assertEquals(resultado, -10, "A soma de -5 + (-5) deveria ser -10");
    }

    // Este teste espera que uma exceção específica seja lançada.
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDividirPorZeroDeveLancarExcecao() {
        System.out.println("Executando testDividirPorZero...");
        calc.dividir(10, 0); // Esta linha deve lançar a exceção
    }
}