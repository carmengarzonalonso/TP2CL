package simulator.model;


import java.util.List;

public class SelectYoungest implements SelectionStrategy {

    @Override
    public Animal select(Animal a, List<Animal> as) {
        if (as == null || as.isEmpty()) return null;

        Animal youngest = null;
        double minAge = Double.MAX_VALUE;

        for (Animal other : as) {
            if (other.getAge() < minAge) {
                minAge = other.getAge();
                youngest = other;
            }
        }

        return youngest;
    }
}
