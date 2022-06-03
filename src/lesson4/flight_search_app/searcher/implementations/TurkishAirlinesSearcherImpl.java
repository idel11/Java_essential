package lesson4.flight_search_app.searcher.implementations;

import lesson4.flight_search_app.models.Ticket;
import lesson4.flight_search_app.searcher.FlightSearcher;

public class TurkishAirlinesSearcherImpl implements FlightSearcher {


    @Override
    public Ticket[] getAllAvailableFlights() {
        String URL = "https://turkishairlines.com/find";
        System.out.println("Calling site: " + URL);

        Ticket[] ticket1 = new Ticket[2];
        ticket1[0] = new Ticket(3, "Istanbul-Kyiv", 1100);
        ticket1[1] = new Ticket(4, "Berlin-Warsaw", 1400);

        convertFromJSON(ticket1);

        return ticket1;
    }

    @Override
    public boolean bookTicket(int id) {

        System.out.println("Visa checking process");

        Ticket[] tickets2 = getAllAvailableFlights();
        for (Ticket t : tickets2) {
            if (t.getId() == id) {
                System.out.println("Ticket is booked");
                return true;
            }
        }
        return false;
    }

    private void convertFromJSON(Ticket[] tickets) {
        System.out.println("Data converted from JSON");
    }
}
