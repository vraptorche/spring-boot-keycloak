package co.jware.keycloak.embedded.support;


import org.jboss.resteasy.core.ResteasyContext;
import org.keycloak.common.util.ResteasyProvider;

public class RestEasyProvider implements ResteasyProvider {
    @Override
    public <R> R getContextData(Class<R> type) {
        return ResteasyContext.getContextData(type);
    }

    @Override
    public void pushDefaultContextObject(Class type, Object instance) {
        ResteasyContext.getContextData(org.jboss.resteasy.spi.Dispatcher.class).getDefaultContextObjects()
                .put(type, instance);
    }

    @Override
    public void pushContext(Class type, Object instance) {
        ResteasyContext.pushContext(type, instance);
    }

    @Override
    public void clearContextData() {
        ResteasyContext.clearContextData();
    }
}
