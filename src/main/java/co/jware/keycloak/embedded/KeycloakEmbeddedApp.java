package co.jware.keycloak.embedded;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeycloakEmbeddedApp {



    public static void main(String[] args) {
        SpringApplication.run(KeycloakEmbeddedApp.class, args);
    }

}
