package org.wcs.checkpoint2.carnetvoyage.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class EtapeResource {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private ResourceCategory category;
    private String resourceUrl;

    @ManyToOne
    @JsonBackReference
    private Etape etape;
}
