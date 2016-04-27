package com.devcore.dto;

import java.util.UUID;

/**
 * base dto
 * Created by e.novichenko on 12.04.2016.
 */
public abstract class BaseDto {

    private UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
