package org.wcs.checkpoint2.carnetvoyage.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Destination {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private LocalDate destinationStart;
    private LocalDate destinationEnd;
    private String country;

    @OneToMany(mappedBy = "cdVDestination")
    @JsonManagedReference
    private final List<Etape> etapeList = new ArrayList<>();

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDestinationStart() {
        return destinationStart;
    }

    public void setDestinationStart(LocalDate destinationStart) {
        this.destinationStart = destinationStart;
    }

    public LocalDate getDestinationEnd() {
        return destinationEnd;
    }

    public void setDestinationEnd(LocalDate destinationEnd) {
        this.destinationEnd = destinationEnd;
    }

    public List<Etape> getEtapeList() {
        return etapeList;
    }
}
