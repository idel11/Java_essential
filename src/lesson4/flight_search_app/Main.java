package lesson4.flight_search_app;

import lesson4.flight_search_app.searchers.FlightSearcher;
import lesson4.flight_search_app.searchers.implementations.AmericaAirlinesSearcherImpl;
import lesson4.flight_search_app.searchers.implementations.TurkishAirLinesSearcherImpl;
import lesson4.flight_search_app.services.AdminTicketsService;

public class Main {
    public static void main(String[] args) {
        FlightSearcher amerfl = new AmericaAirlinesSearcherImpl();
        FlightSearcher turkichFl = new TurkishAirLinesSearcherImpl();
        FlightSearcher[] flightSearchers = {amerfl, turkichFl};
        AdminTicketsService adminTicketsService = new AdminTicketsService(flightSearchers);

        System.out.println("======================== Print All Flights ========================");
        adminTicketsService.printAllFlight();
        System.out.println();
        System.out.println("======================= Find Cheapest Ticket =======================");
        System.out.println("The cheapest ticket is " + adminTicketsService.findCheapestTicket());

    }
}