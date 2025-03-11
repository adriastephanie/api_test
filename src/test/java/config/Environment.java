package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environment {
    private static final Properties properties = new Properties();

    static {
        try {
            // Carrega configurações do ambiente (dev, qa, prod)
            String env = System.getProperty("env", "qa");  // O padrão é "qa"
            properties.load(new FileInputStream("src/test/java/config/" + env + ".properties"));
        } catch (IOException e) {
            throw new RuntimeException("Falha ao carregar arquivo de configuração de ambiente", e);
        }
    }

    public static String getBaseUrl() {
        return properties.getProperty("api.baseUrl");
    }

    public static int getDefaultTimeout() {
        return Integer.parseInt(properties.getProperty("api.timeout", "10000"));
    }
}
