package covid.analysis.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import covid.analysis.model.CovidData;
import covid.analysis.repository.CovidDto;

@Service
public class CsvDataServiceImpl implements CsvService{

	@Autowired
	private CovidDto coviddto;
	
@Override
    public List<CovidData> loadCsvData() {
        InputStream inputStream = getClass().getResourceAsStream("/covid_data.csv");
        Reader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        CsvToBean<CovidData> csvToBean = new CsvToBeanBuilder<CovidData>(reader)
                .withType(CovidData.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        List<CovidData> covidDataList = csvToBean.parse();
        return covidDataList;
    }

	    
	}

	

