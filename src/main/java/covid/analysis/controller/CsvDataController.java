package covid.analysis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import covid.analysis.model.CovidData;
import covid.analysis.service.CsvService;

@RestController
public class CsvDataController {
	
	@Autowired
	private CsvService csvservice;
	 @GetMapping("/load")
	    public List<CovidData> loadData() {
	         
		 try {
			return csvservice.loadCsvData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            return null;

		}
	 }
}
