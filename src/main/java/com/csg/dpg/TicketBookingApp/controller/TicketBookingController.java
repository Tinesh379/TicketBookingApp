package com.csg.dpg.TicketBookingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.csg.dpg.TicketBookingApp.entities.Ticket;
import com.csg.dpg.TicketBookingApp.service.TicketBookingService;

@RestController
@RequestMapping(value="/api")
public class TicketBookingController {
	
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping(value="ticket/create", consumes="application/json")
	public Ticket createTicket(@RequestBody Ticket ticket) {	
		return ticketBookingService.createTicket(ticket);
	}
	
	@GetMapping(value="/ticket/{ticketId}", produces="application/json")
	@ResponseBody
	public Ticket getTicketById(@PathVariable("ticketId")Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);
	}
	
	@GetMapping(value="/ticket/alltickets", produces="application/json")
	@ResponseBody
	public Iterable<Ticket> getAllTickets(){
		return ticketBookingService.getAllTickets();
	}
	
	@DeleteMapping(value="ticket/delete/{ticketId}")
	public void deleteTicketById(@PathVariable("ticketId")Integer ticketId){
		 ticketBookingService.deleteTicketById(ticketId);
	}
	
	@PutMapping(value="/ticket/update/{ticketId}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId, @PathVariable("newEmail")String newEmail) {
		return ticketBookingService.updateTicket(ticketId, newEmail);
	}
}
