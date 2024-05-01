package apicustomquery.services;

import apicustomquery.entities.Flight;
import apicustomquery.entities.enums.StatusEnum;
import apicustomquery.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;


    public List<Flight> provFlights() {
        for (int i = 0; i < 50; i++) {
            Flight flight = new Flight();
            flight.setDescription("Flight " + i);
            flight.setFromAirport("Airport " + i);
            flight.setToAirport("Airport " + (i + 1));
            flight.setStatusEnum(StatusEnum.ONTIME);
            flightRepository.save(flight);
        }
        return flightRepository.findAll();
    }


    public List<Flight> getAllFlights(){
        List<Flight> flights = flightRepository.findAll();
        return flights;
    }


}