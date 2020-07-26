package com.earthgolem.rest;

public class EarthGolem {

    private final long id;
    private final String content;

    public EarthGolem(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
