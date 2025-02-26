package com.arquitecturaMicroserviciosAla.microserviciosAla.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pilots")  // Define la colección en MongoDB
public class Pilot {
    @Id
    private String id;
    private String name;
    private String rank;

    public Pilot() {}

    public Pilot(String id, String name, String rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRank() { return rank; }
    public void setRank(String rank) { this.rank = rank; }
}

