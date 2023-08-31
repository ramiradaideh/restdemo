package com.rami.restdemo.controller;

import org.springframework.stereotype.Controller;
import java.util.logging.Logger;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import model.Greeting;

@Controller
public class GreetingController {
    private static final Logger logger = Logger.getLogger(GreetingController.class.getName());


  @GetMapping("/greeting")
  public String greetingForm(Model model) {
	logger.info("Entering greetingForm method");
    model.addAttribute("greetings", new Greeting());
    logger.info("Exiting greetingForm method");
    return "greetings";
  }

  @PostMapping("/greeting")
  public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
    model.addAttribute("greeting", greeting);
    return "result";
  }

}