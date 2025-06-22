package MachineCodingCaseStudies.Parking.Repositories;

import MachineCodingCaseStudies.Parking.Models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepo {
    Map<Long, Ticket> ticketMap=new HashMap<>();
    public Ticket save(Ticket ticket)
    {
        long id=(long)Math.random();
        ticket.setId(id);
        ticketMap.put(id,ticket);
        return ticket;
    }
}
