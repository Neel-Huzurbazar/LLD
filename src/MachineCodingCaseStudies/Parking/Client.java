package MachineCodingCaseStudies.Parking;

import MachineCodingCaseStudies.Parking.Controllers.TicketController;
import MachineCodingCaseStudies.Parking.DTO.TicketRequestDTO;
import MachineCodingCaseStudies.Parking.Models.Ticket;
import MachineCodingCaseStudies.Parking.Repositories.GateRepo;
import MachineCodingCaseStudies.Parking.Repositories.ParkingLotRepo;
import MachineCodingCaseStudies.Parking.Repositories.TicketRepo;
import MachineCodingCaseStudies.Parking.Repositories.VehicleRepo;
import MachineCodingCaseStudies.Parking.Services.TicketService;

public class Client {
    public static void main(String[] args) {
        //initialize the repos
        GateRepo gateRepo =new GateRepo();
        VehicleRepo vehicleRepo =new VehicleRepo();
        TicketRepo ticketRepo =new TicketRepo();
        ParkingLotRepo parkingLotRepo =new ParkingLotRepo();
        TicketService ticketService =new TicketService(gateRepo,vehicleRepo,parkingLotRepo,ticketRepo);

        //take inputs

        TicketController ticketController=new TicketController(ticketService);
        // Ticket ticket= ticketController.IssueTicket();
    }
}
