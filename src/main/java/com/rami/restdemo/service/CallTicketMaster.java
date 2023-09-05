package com.rami.restdemo.service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Connection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class CallTicketMaster {

    private static final Logger logger = LogManager.getLogger(CallTicketMaster.class);
    // Class to call the REST API to get the call tickets from TicketMaster

    private String website = "https://www.ticketmaster.ca/drake-its-all-a-blur-tour-toronto-ontario-10-07-2023/event/10005E94D40E29D0";


    public String getCallTickets() {
        try {
            // Send an HTTP GET request to the website and parse the HTML content
            Connection connection = Jsoup.connect(website);
            connection.timeout(30000); // 30 seconds connection timeout
            connection.followRedirects(true); // Allow redirects if necessary

            // Execute the HTTP GET request
            Document document = connection.get();
                        
            // You can process the HTML content as needed
            String htmlContent = document.html();
            
            return htmlContent;
        } catch (Exception e) {
            // Handle any exceptions that may occur during the request
            logger.error("Error calling the TicketMaster website: " + e.getMessage());
            return null;
        }
    }

        
    
}
