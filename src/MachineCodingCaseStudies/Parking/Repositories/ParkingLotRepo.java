package MachineCodingCaseStudies.Parking.Repositories;
import MachineCodingCaseStudies.Parking.Models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepo {
    Map<Long,ParkingLot> parkingLotMap =new HashMap<>();
    public ParkingLot findById(long id)
    {
        for(ParkingLot parkingLot:parkingLotMap.values())
        {
            if(parkingLot.getGates().contains(id))
            {
                return parkingLot;
            }
        }
        return null;
    }
}
