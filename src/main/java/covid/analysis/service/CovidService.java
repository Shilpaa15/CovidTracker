package covid.analysis.service;

import java.util.Date;
import java.util.List;

import covid.analysis.model.CovidData;
import covid.analysis.model.DateRange;
import covid.analysis.model.District;
import covid.analysis.model.State;

public interface CovidService {

	
	  public List<State> fetchStateList();

	    public List<District> fetchDistrictListByState(String state);
	    

		public List<String> fetchDataByStateAndDateRange(String state, Date startDate, Date endDate);

		List<CovidData> getCovidDataForDateRange(DateRange dateRange);
}
