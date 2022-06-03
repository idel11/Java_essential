package lesson4.flight_search_app;

import lesson4.flight_search_app.Services.AdminTicketService;
import lesson4.flight_search_app.Services.Implementations.AmericanAirlinesServiceImpl;
import lesson4.flight_search_app.Services.Implementations.TurkishAirlinesServiceImpl;
import lesson4.flight_search_app.searcher.FlightSearcher;
import lesson4.flight_search_app.searcher.implementations.AmericanAirlinesSearcherImpl;
import lesson4.flight_search_app.searcher.implementations.TurkishAirlinesSearcherImpl;

public class Main {

    public static void main(String[] args) {

        FlightSearcher amerFl = new AmericanAirlinesSearcherImpl();
        FlightSearcher turkFl = new TurkishAirlinesSearcherImpl();

        FlightSearcher[] arr = {amerFl, turkFl};

        AdminTicketService adminSerAmer = new AmericanAirlinesServiceImpl();
        AdminTicketService adminSerTur = new TurkishAirlinesServiceImpl();

        System.out.println();
        System.out.println("========================== ALL AVAILABLE TICKETS IN ALL COMPANIES =================================");
        System.out.println();

        adminSerAmer.printAllFlights(arr);

        System.out.println();
        System.out.println("======================== CHEAPEST TICKET FROM AMERICAN AIRLINES ===================================");
        System.out.println();

        System.out.println("Cheapest ticket AmericanAirLines: "
                + adminSerAmer.findCheapest(amerFl.getAllAvailableFlights()));

        System.out.println();
        System.out.println("========================== CHEAPEST TICKET FROM TURKISH AIRLINES =================================");
        System.out.println();

        System.out.println("Cheapest ticket TurkishAirLines: "
                + adminSerTur.findCheapest(turkFl.getAllAvailableFlights()));


        System.out.println();
        System.out.println("=========================== BOOKING PROCESS AMERICAN AIRLINES ================================");
        System.out.println();

        amerFl.bookTicket(1);

        System.out.println( );
        System.out.println("============================ BOOKING PROCESS TURKISH AIRLINES ===============================");
        System.out.println();

        turkFl.bookTicket(4);

    }

}
