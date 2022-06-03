package lesson4.flight_search_app.Services.Implementations;

import lesson4.flight_search_app.Services.AdminTicketService;
import lesson4.flight_search_app.models.Ticket;
import lesson4.flight_search_app.searcher.FlightSearcher;

import java.util.Arrays;

public class TurkishAirlinesServiceImpl implements AdminTicketService {

    @Override
    public void printAllFlights(FlightSearcher[] flightSearchers) {
        for (FlightSearcher f : flightSearchers) {
            System.out.println(Arrays.toString(f.getAllAvailableFlights()));
        }
    }

    @Override
    public Ticket findCheapest(Ticket[] tickets) {

        Ticket cheapest = tickets[0];

        for (int i = 1; i < tickets.length; i++) {

            if (cheapest.getPrice() > tickets[i].getPrice()) {
                cheapest = tickets[i];
            }

        }

        return cheapest;

    }
}