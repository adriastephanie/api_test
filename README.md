# Projeto Base de Java para API

## Tecnologias Utilizadas

Java como linguagem de programação
Maven para gerenciamento de dependências
REST Assured para automação de testes de API
JUnit 5 como framework de testes
Allure Reports para geração de relatórios detalhados

## Estrutura

Princípios aplicados na arquitetura

Separação de Responsabilidades:

clients: Encapsula as chamadas da API

models: Define os objetos de domínio

assertions: Contém validações específicas

specs: Reutiliza especificações comuns

config: Centraliza as configurações

Padrão Page Object para APIs:

Os clientes (como JokeClient) funcionam como "page objects" para APIs
Abstrai os detalhes de implementação das chamadas HTTP


Configuração por Ambiente:

Sistema de carregamento dinâmico de propriedades
Facilita testes em múltiplos ambientes (dev, qa, prod)


Testes Organizados por Funcionalidade:

Pacotes separados para cada endpoint/recurso
Facilita encontrar e manter testes específicos


Relatórios Detalhados com Allure:

Anotações @Step para documentar cada ação
Anexos para incluir respostas no relatório


Assertions Expressivas e Reutilizáveis:

Validações personalizadas que comunicam claramente o propósito

Modelo de Dados Claro:

POJOs com anotações Lombok reduzem código boilerplate
Mapeamento automático das respostas JSON

## Comandos 


Rodar o teste: 

``` mvn clean test -Denv=qa ```

``` mvn clean test -Denv=dev ```

Gerar o relatório:

``` mvn allure:report ```

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