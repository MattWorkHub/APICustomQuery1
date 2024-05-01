package apicustomquery.controllers;

import apicustomquery.entities.Flight;
import apicustomquery.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;



    @GetMapping("/provision")
    public ResponseEntity<List<Flight>>provFlights(){
        List<Flight> flights = flightService.provFlights();
        return ResponseEntity.ok().body(flights);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Flight>> selectAllFlights(){
        List<Flight> allFlights = flightService.getAllFlights();
        return ResponseEntity.ok().body(allFlights);
    }
}