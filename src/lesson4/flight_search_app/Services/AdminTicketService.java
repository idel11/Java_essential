package lesson4.flight_search_app.Services;

import lesson4.flight_search_app.models.Ticket;
import lesson4.flight_search_app.searcher.FlightSearcher;

public interface AdminTicketService {


    void printAllFlights(FlightSearcher[] flightSearchers);

    Ticket findCheapest(Ticket[] tickets);

}
