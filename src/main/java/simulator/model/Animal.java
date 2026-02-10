package simulator.model;

import simulator.misc.Vector2D;

public class Animal implements AnimalInfo, Entity {


    private State state = State.NORMAL;
    private Vector2D position = new Vector2D();
    private String geneticCode = "";
    private Diet diet = Diet.HERBIVORE;
    private double speed = 0.0;
    private double sightRange = 0.0;
    private double energy = 0.0;
    private double age = 0.0;
    private Vector2D destination = new Vector2D();
    private boolean pregnant = false;

    public enum Diet {
        HERBIVORE,
        CARNIVORE

    }

    public enum State {
        NORMAL,
        MATE,
        HUNGER,
        DANGER,
        DEAD
        
    }


    @Override
    public State getState() {
        return state;
    }

    @Override
    public Vector2D getPosition() {
        return position;
    }

    @Override
    public String getGeneticCode() {
        return geneticCode;
    }

    @Override
    public Diet getDiet() {
        return diet;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double getSightRange() {
        return sightRange;
    }

    @Override
    public double getEnergy() {
        return energy;
    }

    @Override
    public double getAge() {
        return age;
    }

    @Override
    public Vector2D getDestination() {
        return destination;
    }

    @Override
    public boolean isPregnant() {
        return pregnant;
    }

    @Override
    public void update(double dt) {
        // basic placeholder: advance age
        age += dt;
    }

}
