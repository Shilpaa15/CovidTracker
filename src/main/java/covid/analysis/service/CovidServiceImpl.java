package covid.analysis.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import covid.analysis.model.CovidData;
import covid.analysis.model.DateRange;
import covid.analysis.model.District;
import covid.analysis.model.State;

@Service
public class CovidServiceImpl implements CovidService {

	@Override
	public List<State> fetchStateList() {
		return null;
	}

	@Override
	public List<District> fetchDistrictListByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	
    // Assume there's a method that retrieves all CovidData for a specific date range
    public List<CovidData> getCovidDataForDateRange(DateRange dateRange) {
		return null;
        // Implement this method based on your data source (e.g., a database query or API call)
        // Return a list of CovidData objects for the specified date range
        // ...
    }

    public void displayConfirmedCasesBetweenTwoStates(String state1, String state2, DateRange dateRange) {
        List<CovidData> covidDataList = getCovidDataForDateRange(dateRange);

        // Filter data for the specified states
        List<CovidData> dataForState1 = covidDataList.stream()
                .filter(data -> data.getState().equalsIgnoreCase(state1))
                .collect(Collectors.toList());

        List<CovidData> dataForState2 = covidDataList.stream()
                .filter(data -> data.getState().equalsIgnoreCase(state2))
                .collect(Collectors.toList());

        // Display results
        System.out.println("Confirmed COVID-19 cases between " + state1 + " and " + state2 + " for the date range "
                + dateRange.getFromDate() + " to " + dateRange. getToDate() + ":");

        System.out.println(state1 + ": " + calculateTotalCases(dataForState1));
        System.out.println(state2 + ": " + calculateTotalCases(dataForState2));
    }

    private long calculateTotalCases(List<CovidData> covidDataList) {
        return covidDataList.stream().mapToLong(CovidData::getConfirmed).sum();
    }

	@Override
	public List<String> fetchDataByStateAndDateRange(String state, Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	

	}

	
	

