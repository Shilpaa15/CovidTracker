package covid.analysis.VirusTrackerApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import covid.analysis.model.CovidData;
import covid.analysis.model.District;
import covid.analysis.model.State;
import covid.analysis.service.CovidService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CovidServiceImplTest {

    @Autowired
    private CovidService covidService;

    // Assuming you have some setup logic in your service, annotate a method with @BeforeEach
    @BeforeEach
    void setUp() {
        // Setup logic if needed
    }

    @Test
    @DisplayName("Test getAllStates with valid data")
    void testGetAllStatesValidData() {
        List<State> states =  covidService.fetchStateList();
        assertNotNull(states);
        assertFalse(states.isEmpty());
        // Add more assertions based on your requirements
    }

    @Test
    @DisplayName("Test getDistrictsByState with valid data")
    void testGetDistrictsByStateValidData() {
        String stateName = "ExampleState";
        List<District> districts = covidService.fetchDistrictListByState(stateName);
        assertNotNull(districts);
        assertFalse(districts.isEmpty());
        // Add more assertions based on your requirements
    }

    @Test
    @DisplayName("Test getDataByStateAndDateRange with valid data")
    void testGetDataByStateAndDateRangeValidData() {
        String stateName = "ExampleState";
        LocalDate startDate = LocalDate.parse("2023-01-01");
        LocalDate endDate = LocalDate.parse("2023-01-31");
        List<CovidData> data = covidService.fetchDataByStateAndDateRange(stateName, startDate, endDate);
        assertNotNull(data);
        assertFalse(data.isEmpty());
        // Add more assertions based on your requirements
    }

    @Test
    @DisplayName("Test getDataByStateAndDateRange with invalid date range")
    void testGetDataByStateAndDateRangeInvalidDateRange() {
        String stateName = "ExampleState";
        LocalDate startDate = LocalDate.parse("2023-02-01");
        LocalDate endDate = LocalDate.parse("2023-01-31");
        
        assertThrows(InvalidDateRangeException.class, () -> {
            covidService.fetchDataByStateAndDateRange(stateName, startDate, endDate);
        });
    }

    }
