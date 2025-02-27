package com.directi.training.ocp.exercice_refactored;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource)
    {
        int resourceId = findFreeResourceSlot(resource);
        if (resourceId == INVALID_RESOURCE_ID) {
            System.out.println("ERROR: No free resource available.");
            return INVALID_RESOURCE_ID;
        }
        resource.markResourceSlotBusy();
        return resourceId;
    }

    public void free(Resource resource)
    {
        resource.markResourceSlotFree();
    }

    private int findFreeResourceSlot(Resource resource)
    {
        return resource.isFreeResource();
    }
}
