package MachineCodingCaseStudies.Parking.DTO;

import MachineCodingCaseStudies.Parking.Models.Slot;
import MachineCodingCaseStudies.Parking.Models.Vehicle;
import MachineCodingCaseStudies.Parking.Models.VehicleType;

public class TicketRequestDTO {
    private VehicleType vehicleType;
    private String vehicleNumber;
    private String vehicleOwner;
    private long gatId;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(String vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    public long getGatId() {
        return gatId;
    }

    public void setGatId(long gatId) {
        this.gatId = gatId;
    }
}
