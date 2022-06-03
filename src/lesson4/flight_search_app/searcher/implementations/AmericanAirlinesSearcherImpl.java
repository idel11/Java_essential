package lesson4.flight_search_app.searcher.implementations;

import lesson4.flight_search_app.models.Ticket;
import lesson4.flight_search_app.searcher.FlightSearcher;

public class AmericanAirlinesSearcherImpl implements FlightSearcher {

    @Override
    public Ticket[] getAllAvailableFlights() {

        String URL = "https://americanairlines.com/find";
        System.out.println("Calling site: " + URL);

        Ticket[] ticket1 = new Ticket[2];
        ticket1[0] = new Ticket(1, "Paris-Rome", 1200);
        ticket1[1] = new Ticket(2, "Madrid-London", 1300);

        convertFroCSV(ticket1);

        return ticket1;
    }

    @Override
    public boolean bookTicket(int id) {

        System.out.println("Background documents checking");

        Ticket[] tickets2 = getAllAvailableFlights();
        for (Ticket t : tickets2) {
            if (t.getId() == id) {
                System.out.println("Ticket is booked");
                return true;
            }
        }
        return false;
    }

    private void convertFroCSV(Ticket[] tickets) {
        System.out.println("Data was converted from CSV format");
    }

}
