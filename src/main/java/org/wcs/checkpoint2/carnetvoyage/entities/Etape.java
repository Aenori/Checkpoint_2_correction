package org.wcs.checkpoint2.carnetvoyage.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Etape {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String city;
    private LocalDate etapeDate;
    @Column(columnDefinition = "TEXT")
    private String summary;
    @ManyToOne
    @JsonBackReference
    private Destination cdVDestination;

    @OneToMany(mappedBy = "etape")
    @JsonManagedReference
    private final List<EtapeResource> etapeResources = new ArrayList();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getEtapeDate() {
        return etapeDate;
    }

    public void setEtapeDate(LocalDate etapeDate) {
        this.etapeDate = etapeDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Destination getCdVDestination() {
        return cdVDestination;
    }

    public void setCdVDestination(Destination cdVDestination) {
        this.cdVDestination = cdVDestination;
    }

    public List<EtapeResource> getEtapeResources() {
        return etapeResources;
    }
}
