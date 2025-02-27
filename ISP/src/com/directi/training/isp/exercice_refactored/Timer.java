package com.directi.training.isp.exercice_refactored;

import com.directi.training.isp.exercise.Door;

import java.util.TimerTask;

public class Timer {
    public void register(long timeOut, final ITimer timedDoor)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                timedDoor.timeOutCallback();
            }
        }, timeOut);
    }
}
