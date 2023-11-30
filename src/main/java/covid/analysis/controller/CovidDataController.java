package covid.analysis.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import covid.analysis.model.DateRange;
import covid.analysis.model.District;
import covid.analysis.model.State;
import covid.analysis.service.CovidService;
import covid.analysis.service.CovidServiceImpl;
import covid.analysis.service.CsvDataServiceImpl;

@RestController
public class CovidDataController {

	@Autowired 
	private CovidService service;
	
	  @GetMapping("/fetch/state")
	    public List<State> fetchStateList() {
	        return service.fetchStateList();
	    }
	
	  @GetMapping("/fetch/districts/{state}")
	    public List<District> fetchDistrictListByState(@PathVariable String state) {
	        return service.fetchDistrictListByState(state);
	    }

	   
	    @GetMapping("/data/{state}/{startDate}/{endDate}")
	    public List<String> fetchDataByStateAndDateRange(@PathVariable String state, @PathVariable Date startDate,
                @PathVariable Date endDate)  {
	        return service.fetchDataByStateAndDateRange(state, startDate, endDate);
	    }
	    
	    }



