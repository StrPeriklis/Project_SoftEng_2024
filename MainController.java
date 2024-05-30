package com.example.omnibus;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller

@RequestMapping("/")
public class MainController {
	
	@Autowired
	private UserRepository userRepository; 
	@Autowired
	private StationRepository stationRepository; 
	@Autowired
	private BusRepository busRepository; 
	@Autowired
	private DriverRepository driverRepository; 
  @Autowired
	private TicketRepository ticketRepository; 
	@Autowired
	private LineRepository lineRepository; 
	@Autowired
	private RateRepository rateRepository; 
	@Autowired
	private BusDriverRepository busdriverRepository; 
	
	@GetMapping("/")
	  public  String startBody(Model model) {
	    
	    return "index";
	  }
