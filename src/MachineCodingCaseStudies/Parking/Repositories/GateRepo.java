package MachineCodingCaseStudies.Parking.Repositories;

import MachineCodingCaseStudies.Parking.Models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepo {
    Map<Long,Gate> gateMap=new HashMap<>();
    public Optional<Gate> findById(long id)
    {
        if(gateMap.containsKey(id))
        {
            return Optional.of(gateMap.get(id));
        }
        return Optional.empty();
    }
}
