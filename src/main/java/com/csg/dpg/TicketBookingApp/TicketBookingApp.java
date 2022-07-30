package com.csg.dpg.TicketBookingApp;

import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.csg.dpg.TicketBookingApp.entities.Ticket;
import com.csg.dpg.TicketBookingApp.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingApp {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApp.class, args);
		
		/*ConfigurableApplicationContext applicationContext = 
		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);
		Ticket ticket = new Ticket();
		
		ticket.setBookingDate(new Date(0));
		ticket.setDestinationStation("Hyderabad");
		ticket.setSourceStation("Pune");
		ticket.setPassengerName("Tinesh Babu Katta");
		ticket.setEmail("tinesh.katta@credit-suisse.com");	
		ticketBookingService.createTicket(ticket);
		*/
	}

}
