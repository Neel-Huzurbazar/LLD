package MachineCodingCaseStudies.Parking.DTO;

import MachineCodingCaseStudies.Parking.Models.ResponseStatus;
import MachineCodingCaseStudies.Parking.Models.Ticket;

public class TicketResponseDTO {
    private Ticket ticket;
    private String errMsg;
    private ResponseStatus status;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
