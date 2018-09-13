package Event;

import Event.resources.EventResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class EventApplication extends Application<EventConfiguration> {

    public static void main(final String[] args) throws Exception {
        new EventApplication().run(args);
    }

    @Override
    public void run(EventConfiguration configuration, Environment environment) {

        DateFormat eventDateFormat = new SimpleDateFormat(configuration.getDateFormat());
        environment.getObjectMapper().setDateFormat(eventDateFormat);

        EventResource eventResource = new EventResource();
        environment.jersey().register(eventResource);
    }

    @Override
    public void initialize(Bootstrap<EventConfiguration> bootstrap) {
    }

}
