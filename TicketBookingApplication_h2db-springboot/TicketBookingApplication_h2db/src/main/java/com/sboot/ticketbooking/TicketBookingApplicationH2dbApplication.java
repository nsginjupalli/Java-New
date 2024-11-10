package com.sboot.ticketbooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sboot.ticketbooking.model.Ticket;
import com.sboot.ticketbooking.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingApplicationH2dbApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplicationH2dbApplication.class, args);
	}

	@Autowired
	private TicketBookingService ticketService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Ticket ticket = new Ticket();
		
		ticket.setPassengerName("Ramu");
		ticket.setSourceStation("Hyderabad");
		ticket.setDestinationStation("GOA");
		ticket.setTravelDate(new Date());
		ticket.setEmail("ramu@gmail.com");
		
		ticketService.createTicket(ticket);
	}

}
