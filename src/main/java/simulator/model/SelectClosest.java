package simulator.model;



import java.util.List;

public class SelectClosest implements SelectionStrategy {

    @Override
    public Animal select(Animal a, List<Animal> as) {
        if (as == null || as.isEmpty()) return null;

        Animal closest = null;
        double minDist = Double.MAX_VALUE;

        for (Animal other : as) {
            double dist = a.getPosition().distanceTo(other.getPosition());

            if (dist < minDist) {
                minDist = dist;
                closest = other;
            }
        }

        return closest;
    }
}

