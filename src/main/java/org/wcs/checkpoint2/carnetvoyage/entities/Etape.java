package org.wcs.checkpoint2.carnetvoyage.entities;

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

    @OneToMany(mappedBy = "etape")
    private List<EtapeResource> etapeResources = new ArrayList();
}
