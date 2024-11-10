package com.sboot.ticketbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sboot.ticketbooking.model.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {
	
	//Create - Insert into Ticket
	
	//Update -> Update ticket
	
	//Read -> Select one record
	
	//Read -> Select all
	
	//Delete -> Delete record
	
	//Deleteall -> All Delete all

}
