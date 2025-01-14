package com.solirius.hosehackathon.controller;

import com.solirius.hosehackathon.domain.Office;
import com.solirius.hosehackathon.repository.OfficeRepository;
import com.solirius.hosehackathon.utilities.Calculate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class OfficeRestController {

    @Autowired
    private OfficeRepository officeRepository;


    @GetMapping(value = "/offices")
    public Iterable<Office> findAll() {
        return officeRepository.findAll();
    }

    @PostMapping(value= "/offices")
    public Office saveOffice(Office office) {
        return officeRepository.save(office);
    }

    @GetMapping(value = "/offices/{id}")
    public Optional<Office> findById(@PathVariable Long id) {
        return officeRepository.findById(id);
    }

    @GetMapping(value = "/findnearest")
    public Iterable<Office> findnearest(
            @RequestParam(name="long", required=true) double longtitude,
            @RequestParam(name="lat", required=true) double latitude,
            @RequestParam(name="attributes", required=false) int attributes)
    {
        Iterable<Office> offices = officeRepository.findAll();
        Calculate cal = new Calculate();
        Calculate c = new Calculate();

        ArrayList<Office> filteredOfficeList = new ArrayList<Office>();

        double currentMinDistance = Double.MAX_VALUE;
        for (Office o : offices)
        {
            double tmpDist = Calculate.distance(latitude,longtitude,o.getLatitude(),o.getLongitude());
            if (tmpDist < currentMinDistance
                    && cal.hasAttributes(o, attributes)){
                    filteredOfficeList.add(o);
                    currentMinDistance = tmpDist;
            };

        }

        return filteredOfficeList; //officeRepository.findAll();
    }

}
