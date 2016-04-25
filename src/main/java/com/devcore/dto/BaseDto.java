package com.devcore.dto;

/**
 * base dto
 * Created by e.novichenko on 12.04.2016.
 */
public abstract class BaseDto {

    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
