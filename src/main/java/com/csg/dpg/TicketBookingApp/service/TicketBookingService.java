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
		return ticketBookingDao.findById(ticketId).orElseThrow();
	}

    public Iterable <Ticket> getAllTickets() {
		return ticketBookingDao.findAll();
	}

	public void deleteTicketById(Integer ticketId) {
		 ticketBookingDao.deleteById(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) {
			Ticket ticketFromDb = ticketBookingDao.findById(ticketId).orElseThrow();
			ticketFromDb.setEmail(newEmail);
			Ticket updatedTicket = ticketBookingDao.save(ticketFromDb);
			return updatedTicket;
			
	}

}