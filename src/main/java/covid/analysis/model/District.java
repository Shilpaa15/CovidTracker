package covid.analysis.model;
import java.util.List;
public class District {
	

	    private String stateCode;
	    private String name;

	    public District(String stateCode, String name) {
	        this.stateCode = stateCode;
	        this.name = name;
	    }

	    public String getStateCode() {
	        return stateCode;
	    }

	    public String getName() {
	        return name;
	    }
	
	    private List<District> districts;

	    public District(List<District> districts) {
	        this.districts = districts;
	    }

	    public void getDistrictsForState(String targetStateCode) {
	        // Using Stream, Lambda, Predicate, and Method Reference
	        districts.stream()
	                 .filter(d -> d.getStateCode().equals(targetStateCode)) // Using a Predicate
	                 .map(District::getName) // Method Reference
	                 .forEach(System.out::println); // Method Reference
	    }
	}

