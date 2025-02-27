package com.directi.training.ocp.exercice_refactored;

public class Time implements Resource {
    private int resourceId;
    @Override
    public int isFreeResource() {
        return 0;
    }

    @Override
    public void markResourceSlotBusy() {

    }

    @Override
    public void markResourceSlotFree() {

    }
}
