package com.pragma.onclass.domain.model;





public class Technology {
    private final Long id;
    private  String name;

    private final String description;

    public Technology(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public void setName(String name) {
        this.name  = name;
    }
}
