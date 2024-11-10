package com.sboot.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.ticketbooking.dao.TicketBookingDao;
import com.sboot.ticketbooking.model.Ticket;

@Service
public class TicketBookingService {
	
	@Autowired
	private TicketBookingDao ticketDao;
	
	
	
	
	//Create Ticket
	
	public Ticket createTicket(Ticket ticket) {
		
		
		return ticketDao.save(ticket);
		//save method will insert the data
		//insert into ticket values(ticket.passenger,ticket.source...);
		
	}
	
	
	// Get All Ticket
	
	public Iterable<Ticket> getAllTickets(){
		
		return ticketDao.findAll();
		
		//findAll -> select * from tbl_ticket;
		
	}
	
	
	// Get Ticket
	
	public Ticket getTicket(Integer ticketId) {
		
		return ticketDao.findById(ticketId).orElse(new Ticket());
		
		//findById -> select * from tbl_ticket where ticket_id=ticketId
	}
	
	
	
	//Delete Ticket
	
	public void deleteTicket(Integer ticketId) {
		ticketDao.deleteById(ticketId);
		
		//deleteById -> delete from tbl_ticket where ticket_id=ticketId
	}
	
	
	//Update Ticket
	
	public Ticket updateTicket(Integer ticketId,String newEmail) {
		
		
		//save Method -> Insert when no PRIMARY KEY in the data
		 //             ->update when PRIMARY KEY in the data
		
		
		Ticket dbTicketObj=getTicket(ticketId);
		dbTicketObj.setEmail(newEmail);
		
		return ticketDao.save(dbTicketObj);
		
	}
	

}
