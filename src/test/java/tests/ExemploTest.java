package tests;

import base.BaseTest;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("API de Exemplo")
@Feature("Endpoint de Exemplo")
public class ExemploTest extends BaseTest {

    private static final String ENDPOINT = "/categories"; // Substitua pelo endpoint que deseja testar

    @Test
    @DisplayName("Verifica se o endpoint retorna status 200")
    @Description("Este teste verifica se o endpoint de usuários retorna código de status 200")
    @Severity(SeverityLevel.CRITICAL)
    public void testEndpointReturns200() {
        given()
                .when()
                .get(ENDPOINT)
                .then()
                .statusCode(200);
    }

    @Test
    @DisplayName("Verifica formato da resposta")
    @Description("Este teste verifica se a resposta está no formato esperado")
    @Severity(SeverityLevel.NORMAL)
    public void testResponseFormat() {
        Response response = given()
                .when()
                .get(ENDPOINT)
                .then()
                .statusCode(200)
                .extract().response();

        // Adiciona a resposta ao relatório Allure
        Allure.addAttachment("Resposta", "application/json", response.asString(), "json");

        // Aqui você pode adicionar verificações específicas sobre o formato da resposta
        // Por exemplo, verificar se um campo específico existe ou tem o valor esperado
    }
}
