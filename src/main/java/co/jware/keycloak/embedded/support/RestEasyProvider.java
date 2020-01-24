package co.jware.keycloak.embedded.support;


import org.jboss.resteasy.core.Dispatcher;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.keycloak.common.util.ResteasyProvider;

public class RestEasyProvider implements ResteasyProvider {
    @Override
    public <R> R getContextData(Class<R> type) {
        return ResteasyProviderFactory.getInstance().getContextData(type);
    }

    @Override
    public void pushDefaultContextObject(Class type, Object instance) {
        ResteasyProviderFactory.getInstance().getContextData(Dispatcher.class).getDefaultContextObjects().put(type, instance);
    }

    @Override
    public void pushContext(Class type, Object instance) {
        ResteasyProviderFactory.pushContext(type, instance);
    }

    @Override
    public void clearContextData() {
        ResteasyProviderFactory.clearContextData();
    }
}
