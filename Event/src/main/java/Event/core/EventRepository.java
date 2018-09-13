package Event.core;

import Event.api.Event;

import java.util.List;

public interface EventRepository {

    List<Event> findAll();

}
