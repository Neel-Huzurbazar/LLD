package MachineCodingCaseStudies.Parking.Controllers;

import MachineCodingCaseStudies.Parking.DTO.TicketRequestDTO;
import MachineCodingCaseStudies.Parking.DTO.TicketResponseDTO;
import MachineCodingCaseStudies.Parking.Models.ResponseStatus;
import MachineCodingCaseStudies.Parking.Models.Ticket;
import MachineCodingCaseStudies.Parking.Services.TicketService;

public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketResponseDTO IssueTicket(TicketRequestDTO ticketRequestDTO)
    {
        TicketResponseDTO ticketResponseDTO =new TicketResponseDTO();
        Ticket ticket;
        try{
            ticket=ticketService.issueTicket(ticketRequestDTO.getVehicleType(),
                    ticketRequestDTO.getVehicleNumber(),
                    ticketRequestDTO.getVehicleOwner(),
                    ticketRequestDTO.getGatId());
        }
        catch (Exception err)
        {
            ticketResponseDTO.setErrMsg("Something went wrong");
            ticketResponseDTO.setStatus(ResponseStatus.FAILURE);
            return ticketResponseDTO;
        }
        ticketResponseDTO.setTicket(ticket);
        ticketResponseDTO.setStatus(ResponseStatus.SUCCESS);
        return ticketResponseDTO;
    }
}
