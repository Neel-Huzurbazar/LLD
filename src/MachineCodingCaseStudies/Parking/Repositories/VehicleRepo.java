package MachineCodingCaseStudies.Parking.Repositories;

import MachineCodingCaseStudies.Parking.Models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepo {
    Map<String, Vehicle> vehicleMap =new HashMap<>();

    public Optional<Vehicle> findById(String vehicleNumber)
    {
        if(vehicleNumber.contains(vehicleNumber))
        {
            return Optional.of(vehicleMap.get(vehicleNumber));
        }
        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle)
    {
        vehicle.setId((long)Math.random());
        vehicleMap.put(vehicle.getVehicleNumber(),vehicle);
        return  vehicle;
    }
}
