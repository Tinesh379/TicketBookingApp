package com.csg.dpg.TicketBookingApp.dao;

import org.springframework.data.repository.CrudRepository;
import com.csg.dpg.TicketBookingApp.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{
	//Ticket findOne(Integer ticketId);
}
