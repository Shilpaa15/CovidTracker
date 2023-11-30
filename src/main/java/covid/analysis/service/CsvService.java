package covid.analysis.service;

import java.util.List;

import covid.analysis.model.CovidData;

public interface CsvService {
    public  List<CovidData> loadCsvData();
    
    
}
