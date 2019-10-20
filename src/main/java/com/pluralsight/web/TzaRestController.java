package com.pluralsight.web;

import com.pluralsight.entity.Application;
import com.pluralsight.entity.Release;
import com.pluralsight.entity.Ticket;
import com.pluralsight.service.ApplicationService;
import com.pluralsight.service.ReleaseService;
import com.pluralsight.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TzaRestController {
    private ApplicationService applicationService;
    private TicketService ticketService;
    private ReleaseService releaseService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @Autowired
    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Autowired
    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    @GetMapping("/api/applications")
    public Iterable<Application> retrieveApplications(Model model){
        return  applicationService.listApplications();
    }

    @GetMapping("/api/tickets")
    public Iterable<Ticket> retrieveTickets(Model model){
        return  ticketService.listTickets();
    }

    @GetMapping("/api/releases")
    public Iterable<Release> retrieveReleases(Model model){
        return releaseService.listReleases();

    }
}