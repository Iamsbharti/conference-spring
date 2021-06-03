package com.learn.conference.model;

import org.springframework.lang.NonNull;
import javax.validation.constraints.NotEmpty;

public class Registration {
    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
