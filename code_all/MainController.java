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
	
	
	@GetMapping("/userpage")
	  public  String startBody(HttpSession session,Model model) {
		
	    String uid=session.getAttribute("uid").toString();
	    System.out.print(uid);
	    return "userpage";
	  }
	
	@GetMapping("/map")
	  public  String map(HttpSession session,Model model) {
		
	    String uid=session.getAttribute("uid").toString();
	    System.out.print(uid);
	    return "map";
	  }
	
	
	
	
	@GetMapping("/getPoints")
	  public @ResponseBody Iterable<Station>  getPoints() {
		return stationRepository.findAll();
	   
	  }
	
	
	@GetMapping("/getBuses")
	  public @ResponseBody Iterable<Bus>  getbuses() {
		return busRepository.findAll();
	   
	  }
	
	@GetMapping("/getDrivers")
	  public @ResponseBody Iterable<Driver>  getdrivers() {
		return driverRepository.findAll();
	   
	  }
	

	@PostMapping("/signup") 
	  public @ResponseBody String signup(@RequestParam String fullname, @RequestParam String email
		      , @RequestParam String password) {
	    
		User u=new User();
		u.setEmail(email);
		u.setPassword(password);
		u.setFullname(fullname);
		try {
		userRepository.save(u);
		return "1";
		}
		catch(Exception e)
		{
			return "0";	
		}
	    
	  }
	

	
}
