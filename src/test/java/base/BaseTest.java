package base;


import config.TestConfig;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected RequestSpecification requestSpec;
    protected ResponseSpecification validResponseSpec;

    @BeforeAll
    public void setup() {
        // Usar a configuração centralizada
        requestSpec = TestConfig.getRequestSpec();

        // Configurar especificação de resposta válida
        validResponseSpec = specs.JokeSpecs.validResponseSpec();

        // Configuração global do RestAssured
        RestAssured.requestSpecification = requestSpec;
        RestAssured.responseSpecification = validResponseSpec;
    }
}