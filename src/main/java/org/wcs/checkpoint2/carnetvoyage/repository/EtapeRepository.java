package org.wcs.checkpoint2.carnetvoyage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wcs.checkpoint2.carnetvoyage.entities.Etape;

public interface EtapeRepository extends JpaRepository<Etape, Integer> {
}
