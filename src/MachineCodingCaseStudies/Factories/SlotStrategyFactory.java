package MachineCodingCaseStudies.Factories;

import MachineCodingCaseStudies.Parking.Models.AllocationStrategy;
import MachineCodingCaseStudies.Parking.Strategies.SlotStrategy.FarthestAllocation;
import MachineCodingCaseStudies.Parking.Strategies.SlotStrategy.NearestAllocation;
import MachineCodingCaseStudies.Parking.Strategies.SlotStrategy.RandomAllocation;
import MachineCodingCaseStudies.Parking.Strategies.SlotStrategy.SlotStrategy;

public class SlotStrategyFactory {
    public static SlotStrategy getStrategy(AllocationStrategy strategy)
    {
        if(strategy== AllocationStrategy.NEAREST)
        {
            return new NearestAllocation();
        }
        else if(strategy==AllocationStrategy.FARTHEST)
        {
            return new FarthestAllocation();
        }
        else if(strategy==AllocationStrategy.RANDOM)
        {
            return new RandomAllocation();
        }
        return new NearestAllocation();
    }
}
