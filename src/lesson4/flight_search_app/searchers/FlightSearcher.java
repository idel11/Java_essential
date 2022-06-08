package lesson4.flight_search_app.searchers;

import lesson4.flight_search_app.models.Ticket;


public interface FlightSearcher {
    Ticket[] getAllAvailableFlights();
    boolean bookTicket(int id);

}
