package com.example.FinalSpringboot;

import com.example.FinalSpringboot.entity.Stop;
import com.example.FinalSpringboot.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalSpringbootApplication {
	private final AgencyRepository agencyRepository;
	private final BusRepository busRepository;
	private final RoleRepository roleRepository;
	private final StopRepository stopRepository;
	private final TicketRepository ticketRepository;
	private final TripRepository tripRepository;
	private final TripScheduleRepository tripScheduleRepository;
	private final UserRepository userRepository;
	private final Logger LOG = LoggerFactory.getLogger(FinalSpringbootApplication.class);

	@Autowired
	public FinalSpringbootApplication(AgencyRepository agencyRepository, BusRepository busRepository, RoleRepository roleRepository, StopRepository stopRepository, TicketRepository ticketRepository, TripRepository tripRepository, TripScheduleRepository tripScheduleRepository, UserRepository userRepository){
		this.agencyRepository = agencyRepository;
		this.busRepository = busRepository;
		this.roleRepository = roleRepository;
		this.stopRepository = stopRepository;
		this.ticketRepository = ticketRepository;
		this.tripRepository = tripRepository;
		this.tripScheduleRepository = tripScheduleRepository;
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(FinalSpringbootApplication.class, args);
	}
}