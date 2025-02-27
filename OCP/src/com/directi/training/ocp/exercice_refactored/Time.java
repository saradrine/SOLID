package com.directi.training.ocp.exercice_refactored;

public class Time implements Resource {
    private int resourceId;
    @Override
    public int isFreeResource() {
        return 0;
    }

    @Override
    public void markResourceSlotBusy() {
        // Implementation of the mark time slot busy logic
    }

    @Override
    public void markResourceSlotFree() {
        // Implementation of the mark time slot free logic
    }
}
