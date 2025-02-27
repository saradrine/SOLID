package com.directi.training.ocp.exercice_refactored;

public interface Resource {
    public int isFreeResource ();
    public void markResourceSlotBusy ();
    public void markResourceSlotFree ();

}
