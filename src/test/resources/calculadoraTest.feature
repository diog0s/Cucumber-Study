Feature: Calculadora contendo as quatro operacoes basicas
  Scenario: Soma
    Given que o app esta rodando
    When eu somar <5> + <5>
    Then o resultado da soma e <10>

  Scenario: Subtracao
    Given que o app esta rodando
    When eu subtrair <10> - <10>
    Then o resultado da subtracao e <0>

  Scenario: divisao
    Given que o app esta rodando
    When eu dividir <10> / <2>
    Then o resultado da divisao e <5>

  Scenario:
    Given que o app esta rodando
    When eu multiplicar <2> * <2>
    Then o resultado da multiplicacao e <4>
