package io.nology.lifts;
import static io.nology.lifts.TravelDirection.*;


public class Lift {
    private boolean[] destinations;
    private TravelDirection travelDirection;
    private int location;               // concern
    private int currentOrLastFloor;     // concern

    public Lift(int floors) {
        destinations = new boolean[floors];
        for (int i=0; i<floors; i++)
            destinations[i] = false;
        location = 0;
        currentOrLastFloor = 0;
        travelDirection = NONE;
    }

    public int getFloor() { return currentOrLastFloor; }
    public boolean[] getDestinations() { return destinations; }
    public TravelDirection getTravelDirection() { return travelDirection; }
    public int getLocation() { return location; }
}
