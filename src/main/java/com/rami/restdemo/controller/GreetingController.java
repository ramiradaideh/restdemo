package com.rami.restdemo.controller;

import org.springframework.stereotype.Controller;
import java.util.logging.Logger;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rami.restdemo.model.Greeting;
import com.rami.restdemo.model.User;
import com.rami.restdemo.service.CallTicketMaster;

//This is a MVC controller, rendering html templates as responses
@Controller
public class GreetingController {
    private static final Logger logger = Logger.getLogger(GreetingController.class.getName());


  @GetMapping("/greeting")
  public String greetingForm(Model model) {
    logger.info("Entering greetingForm method");
    model.addAttribute("greeting", new Greeting());
    logger.info("Exiting greetingForm method");

		CallTicketMaster callTicketMaster = new CallTicketMaster();
    String htmlContent = callTicketMaster.getCallTickets();
		logger.info(htmlContent);

    return "greetings";
  }

  @GetMapping("/hello")
  public String sampleString(@RequestParam(required = false) Integer age,@RequestParam String name,Model model) {
    User user = new User();
    
    // Set the "name" property of the User object if "name" parameter is provided.
    if (name != null) {
        user.setname(name);
    }

    model.addAttribute("user", user);

    
    return "success";
  }

  @PostMapping("/greeting")
  public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
    model.addAttribute("greeting", greeting);
    return "result";
  }

}