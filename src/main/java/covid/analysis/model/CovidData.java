package covid.analysis.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import jakarta.persistence.Entity;
//import javax.persistence.Entity;


@Entity
public class CovidData {
	 @CsvBindByName(column = "Date")
	    @CsvDate(value = "yyyy-mm-dd")
	private Date date;
	 
  @CsvBindByName(column = "State")
 private String state;
  
  @CsvBindByName(column = "District")
	private String district;
  
  @CsvBindByName(column = "Tested")
	private int tested;
  
  @CsvBindByName(column = "Confirmed")
	private int confirmed;
  
  @CsvBindByName(column = "Recovered")
	private int recovered;
	@Id
	private int id;
	
	 public void setDateFromString(String dateString) {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        try {
	            this.date = dateFormat.parse(dateString);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	    }
	
	public CovidData(Date date, String state, String district, int tested, int confirmed, int recovered, int id) {
		super();
		this.date = date;
		this.state = state;
		this.district = district;
		this.tested = tested;
		this.confirmed = confirmed;
		this.recovered = recovered;
		this.id = id;
	}
	
	public CovidData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getTested() {
		return tested;
	}

	public void setTested(int tested) {
		this.tested = tested;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CovidData [date=" + date + ", state=" + state + ", district=" + district + ", tested=" + tested
				+ ", confirmed=" + confirmed + ", recovered=" + recovered + ", id=" + id + "]";
	}
}
