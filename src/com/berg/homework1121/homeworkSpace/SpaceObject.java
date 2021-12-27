package com.berg.homework1121.homeworkSpace;

public abstract class SpaceObject {

    public long calculateDiameter(long radius) {
        return 2 * radius;
    }

    public long compareMass(SpaceObject spaceObject) {
        return getMass() - spaceObject.getMass();
    }

    protected abstract long getMass();

}
