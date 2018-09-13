package Event.resources;

import Event.api.Event;
import Event.core.EventRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("events")
@Produces(MediaType.APPLICATION_JSON)
public class EventResource {

    private EventRepository repository;

    public EventResource(EventRepository repository) {
        this.repository = repository;
    }

    @GET
    public List<Event> allEvents() {
        return repository.findAll();
    }
}
