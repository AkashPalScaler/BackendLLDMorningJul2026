package com.scaler.ParkingLot.Controllers;

import com.scaler.ParkingLot.DTOs.IssueTicketRequestDTO;
import com.scaler.ParkingLot.DTOs.IssueTicketResponseDTO;
import com.scaler.ParkingLot.DTOs.ResponseDTO;
import com.scaler.ParkingLot.DTOs.ResponseStatus;
import com.scaler.ParkingLot.Models.Ticket;
import com.scaler.ParkingLot.Services.TicketService;

public class TicketController {
    TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(
                    requestDTO.getOperatorId(),
                    requestDTO.getRegistrationNumber(),
                    requestDTO.getOwnerName(),
                    requestDTO.getOwnerNumber()
            );

            responseDTO.setTicketNumber(ticket.getNumber());
            responseDTO.setEntryDate(ticket.getEntryTime());
            responseDTO.setResponse(new ResponseDTO("Ticket creation successful", ResponseStatus.SUCCESS));

        }catch (Exception e){
            System.out.println("Error in creating ticket : " + e.getMessage());
            e.printStackTrace();
            responseDTO.setResponse(new ResponseDTO("Error in creating ticket", ResponseStatus.ERROR));
        }

        return responseDTO;
    }
}
