package org.wcs.checkpoint2.carnetvoyage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.wcs.checkpoint2.carnetvoyage.entities.Destination;
import org.wcs.checkpoint2.carnetvoyage.repository.DestinationRepository;

import java.util.List;

@RestController
@RequestMapping(value = "destinations")
public class DestinationController {
    @Autowired
    DestinationRepository destinationRepository;

    @GetMapping("")
    List<Destination> getAll() {
        return destinationRepository.findAll();
    }

    @PostMapping("")
    Destination create(@ModelAttribute Destination cdVDestination) {
        return destinationRepository.save(cdVDestination);
    }

    @GetMapping("/{id}")
    Destination getOne(@PathVariable("id") Integer id) {
        return destinationRepository.findById(id)
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
                );
    }

    @PutMapping(value = "/{id}", consumes = "application/json")
    Destination update(@PathVariable("id") Integer id, @RequestBody Destination cdVDestination) {
        cdVDestination.setId(id);
        return destinationRepository.save(cdVDestination);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        destinationRepository.deleteById(id);
    }
}
