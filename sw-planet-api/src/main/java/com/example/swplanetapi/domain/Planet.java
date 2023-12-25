package com.example.swplanetapi.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table("planets")
public class Planet {

    private Long id;
    private String name;
    private String climate;
    private String terrain;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClimate() {
        return climate;
    }
    public void setClimate(String climate) {
        this.climate = climate;
    }
    public String getTerrain() {
        return terrain;
    }
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }


    
    
}
