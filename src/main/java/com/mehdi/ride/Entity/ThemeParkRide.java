package com.mehdi.ride.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ThemeParkRide {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String decsription;
    private Integer thrillFactor;
    private String vomitFactor;

    public ThemeParkRide() {
    }

    public ThemeParkRide(Long id, String name, String decsription, Integer thrillFactor, String vomitFactor) {
        this.id = id;
        this.name = name;
        this.decsription = decsription;
        this.thrillFactor = thrillFactor;
        this.vomitFactor = vomitFactor;
    }

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

    public String getDecsription() {
        return decsription;
    }

    public void setDecsription(String decsription) {
        this.decsription = decsription;
    }

    public Integer getThrillFactor() {
        return thrillFactor;
    }

    public void setThrillFactor(Integer thrillFactor) {
        this.thrillFactor = thrillFactor;
    }

    public String getVomitFactor() {
        return vomitFactor;
    }

    public void setVomitFactor(String vomitFactor) {
        this.vomitFactor = vomitFactor;
    }
}
