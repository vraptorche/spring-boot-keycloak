package co.jware.keycloak.embedded;

import org.keycloak.services.resources.KeycloakApplication;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/auth")
public class EmbeddedKeycloakApplication extends KeycloakApplication {
}
