package com.csg.dpg.TicketBookingApp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csg.dpg.TicketBookingApp.dao.TicketBookingDao;
import com.csg.dpg.TicketBookingApp.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}
	
	public Ticket getTicketById(Integer ticketId) {
		return (Ticket) ticketBookingDao.findAll();
	}

}
