package lesson4.flight_search_app.services;

import lesson4.flight_search_app.models.Ticket;
import lesson4.flight_search_app.searchers.FlightSearcher;


import java.util.Arrays;

public class AdminTicketsService {
    private FlightSearcher[] flightSearchers;

    public AdminTicketsService(FlightSearcher[] flightSearchers) {
        this.flightSearchers = flightSearchers;
    }

    public FlightSearcher[] getFlightSearchers() {
        return flightSearchers;
    }

    public void setFlightSearchers(FlightSearcher[] flightSearchers) {
        this.flightSearchers = flightSearchers;
    }

    public void printAllFlight() {
        for (FlightSearcher fl : flightSearchers) {
            System.out.println(Arrays.toString(fl.getAllAvailableFlights()));
        }
    }

    public Ticket findCheapestTicket() {

        Ticket cheapest = null;
        for (FlightSearcher fl : flightSearchers) {
            cheapest = fl.getAllAvailableFlights()[0];
            for (int i = 1; i < fl.getAllAvailableFlights().length; i++) {
                if (fl.getAllAvailableFlights()[i].getPrice() < cheapest.getPrice()) {
                    cheapest = fl.getAllAvailableFlights()[i];
                }

            }
        }
        System.out.println();
        return cheapest;
    }
}
