package MachineCodingCaseStudies.Parking.Services;

import MachineCodingCaseStudies.Exceptions.GateNotFoundException;
import MachineCodingCaseStudies.Factories.SlotStrategyFactory;
import MachineCodingCaseStudies.Parking.Models.*;
import MachineCodingCaseStudies.Parking.Repositories.GateRepo;
import MachineCodingCaseStudies.Parking.Repositories.ParkingLotRepo;
import MachineCodingCaseStudies.Parking.Repositories.TicketRepo;
import MachineCodingCaseStudies.Parking.Repositories.VehicleRepo;
import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepo gateRepo;
    private VehicleRepo vehicleRepo;
    private ParkingLotRepo parkingLotRepo;
    private TicketRepo ticketRepo;

    public TicketService(GateRepo gateRepo, VehicleRepo vehicleRepo, ParkingLotRepo parkingLotRepo, TicketRepo ticketRepo) {
        this.gateRepo = gateRepo;
        this.vehicleRepo = vehicleRepo;
        this.parkingLotRepo = parkingLotRepo;
        this.ticketRepo = ticketRepo;
    }

    public Ticket issueTicket(VehicleType vehicleType, String vehicleNumber, String vehicleOwner, long gateId) throws GateNotFoundException {
        Ticket ticket=new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setTicketNumber((int)Math.random());

        //check if the gate is valid
        Optional<Gate>  gateOptional = gateRepo.findById(gateId);
        if(gateOptional.isEmpty())
        {
            throw new GateNotFoundException("Invalid gate id provided");
        }
        ticket.setGate(gateOptional.get());

        //check if the vehicle is already registered
        Vehicle vehicle;
        Optional<Vehicle> vehicleOptional = vehicleRepo.findById(vehicleNumber);
        if(vehicleOptional.isEmpty())
        {
            vehicle=new Vehicle();
            vehicle.setOwnerName(vehicleOwner);
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
        }
        else{
            vehicle=vehicleOptional.get();
        }
        ticket.setVehicle(vehicle);

        //find parking lot from the gat id
        ParkingLot parkingLot=parkingLotRepo.findById(gateId);

        //get parking strategy for the parking lot
        AllocationStrategy allocationStrategy=parkingLot.getSlotStrategy();

        //allocate a slot
        ticket.setSlot(SlotStrategyFactory.getStrategy(allocationStrategy).findSlot());

        return ticketRepo.save(ticket);
    }
}
