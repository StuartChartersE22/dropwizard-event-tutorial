package Event.health;

import Event.resources.EventResource;
import com.codahale.metrics.health.HealthCheck;

public class ResourceHealthCheck extends HealthCheck {
    private final EventResource eventResource;

    public ResourceHealthCheck(EventResource eventResource) {
        this.eventResource = eventResource;
    }

    @Override
    protected Result check() throws Exception {
        return Result.healthy() ;
    }
}


