package com.sboot.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.ticketbooking.model.Ticket;
import com.sboot.ticketbooking.service.TicketBookingService;

@RestController
@RequestMapping(value="/ticket") //http://localhost:8080/ticket
public class TicketController {
	
	//REST SERVICE CONCEPTS
	
	// @GET -> Getting Data -> @GetMapping -> @Get + @RequestMapping
	// @POST -> Creating Data -> @PostMapping -> @Post + @RequestMapping
	//@PUT -> Updating Data
	//@Delete -> Deleting Data
	
	@Autowired
	private TicketBookingService ticketService;
	
	@GetMapping(value="/all") //http://localhost:8080/ticket/all
	public Iterable<Ticket> getAllTickets(){
		
		return ticketService.getAllTickets();
		
	}
	
	
	@PostMapping(value="/create") //http://localhost:8080/ticket/create
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketService.createTicket(ticket);
	}
	
	
	@GetMapping(value="/{ticketId}") //http://localhost:8080/ticket/1
	public Ticket getTicket(
			@PathVariable("ticketId") Integer ticketId
						){
		return ticketService.getTicket(ticketId);
		
	}
	
	@DeleteMapping(value="/{ticketId}") //http://localhost:8080/ticket/1
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		
		ticketService.deleteTicket(ticketId);
		
	}
	
	@PutMapping(value="/update/{ticketId}/{newEmail}")
	//http://localhost:8080/ticket/update/1/a@b.com
	public Ticket updateTicket(
			@PathVariable("ticketId") Integer ticketId,
			@PathVariable("newEmail") String newEmail) {
		
		return ticketService.updateTicket(ticketId, newEmail);
	}
	

}
