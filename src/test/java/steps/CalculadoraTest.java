package steps;

import br.cin.ufpe.Calculadora;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class CalculadoraTest {
    Calculadora calculadora;
    int calculo;

    //Soma
    @Given("^que o app esta rodando$")
    public void queOAppEstaRodando() {
        calculadora = new Calculadora();
        calculo = 0;
    }

    @When("^eu somar <(\\d+)> \\+ <(\\d+)>$")
    public void euSomar(int numA, int numB) {
        calculo = calculadora.somar(numA, numB);
    }

    @Then("^o resultado da soma e <(\\d+)>$")
    public void oResultadoDaSomaE(int result) {
        assertEquals(calculo, result);
    }

    //Subtração
    @When("^eu subtrair <(\\d+)> - <(\\d+)>$")
    public void eu_subtrair(int numA, int numB) {
        calculo = calculadora.subtrair(numA, numB);
    }

    @Then("^o resultado da subtracao e <(\\d+)>$")
    public void o_resultado_da_subtracao_e(int result) {
        assertEquals(calculo, result);
    }

    //Divisao
    @When("^eu dividir <(\\d+)> / <(\\d+)>$")
    public void eu_dividir(int numA, int numB) {
        calculo = calculadora.dividir(numA, numB);
    }

    @Then("^o resultado da divisao e <(\\d+)>$")
    public void o_resultado_da_divisao_e(int result) {
        assertEquals(calculo, result);
    }

    //Multiplicacao

    @When("^eu multiplicar <(\\d+)> \\* <(\\d+)>$")
    public void eu_multiplicar(int numA, int numB) {
        calculo = calculadora.multiplicar(numA, numB);
    }

    @Then("^o resultado da multiplicacao e <(\\d+)>$")
    public void o_resultado_da_multiplicacao_e(int result) {
        assertEquals(calculo, result);
    }


}
