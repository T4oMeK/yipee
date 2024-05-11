package com.yipee.yipeebackend.utility;

import jakarta.persistence.EntityNotFoundException;

public class ExceptionUtility {
    public static EntityNotFoundException entityNotFound(String entityName, int entityId) {
        return new EntityNotFoundException(String.format(entityName + " with id %d does not exist.", entityId));
    }
}
