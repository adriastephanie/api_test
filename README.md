# Projeto Base de Java para API

## Tecnologias Utilizadas

Java como linguagem de programação
Maven para gerenciamento de dependências
REST Assured para automação de testes de API
JUnit 5 como framework de testes
Allure Reports para geração de relatórios detalhados

## Estrutura

- BaseTest.java: Classe base com configurações comuns e setup do ambiente
- ExemploTest.java:  teste com cenario do endpoint

## Comandos 


Rodar o teste: 

``` mvn clean test ```

Gerar o relatório:

``` mvn allure:report ``

Rodar servidor do Allure: 

``` mvn allure:serve```

## Conceitos 

### Rest Assured
Rest Assured é uma biblioteca Java que permite testar APIs REST facilmente. Seus principais conceitos são:

given(): Configuração do teste (cabeçalhos, parâmetros, autenticação, etc.)
when(): Ação a ser executada (GET, POST, PUT, DELETE, etc.)
then(): Validações e verificações dos resultados

### JUnit 5
JUnit 5 é um framework de teste que oferece:

@Test: Marca um método como um teste
@DisplayName: Dá um nome legível ao teste
@BeforeAll/@AfterAll: Métodos executados uma vez antes/depois de todos os testes
@BeforeEach/@AfterEach: Métodos executados antes/depois de cada teste

### Allure Reports
Allure é um framework de relatórios que oferece:

@Epic: Define um grupo de funcionalidades relacionadas
@Feature: Define uma funcionalidade específica
@Story: Define uma história de usuário
@Description: Descrição detalhada do teste
@Severity: Nível de severidade do teste
@Step: Define um passo dentro do teste para melhor visualização no relatório