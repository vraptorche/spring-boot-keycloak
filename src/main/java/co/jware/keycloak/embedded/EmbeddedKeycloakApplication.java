package co.jware.keycloak.embedded;

import org.keycloak.services.resources.KeycloakApplication;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/auth")
public class EmbeddedKeycloakApplication extends KeycloakApplication {
}
