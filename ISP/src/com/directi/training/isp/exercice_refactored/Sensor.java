package com.directi.training.isp.exercice_refactored;

import com.directi.training.isp.exercise.Door;

import java.util.Random;

public class Sensor {
    public void register(ISensor sensingDoor)
    {
        while (true) {
            if (isPersonClose()) {
                sensingDoor.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
