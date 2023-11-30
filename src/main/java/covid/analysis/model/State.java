package covid.analysis.model;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class State {
	
	    private String code;
	    private String name;

	
	    public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		private List<State> states;

	    public State(List<State> states) {
	        this.states = states;
	    }

	    public void getUniqueStateCodes() {
	        // Using Stream, Lambda, Predicate, and Method Reference
	        states.stream()
	              .map(State::getCode) // Method Reference
	              .filter(distinct()) // Using a Predicate
	              .forEach(System.out::println); // Method Reference
	    }

	    // Custom Predicate to filter distinct elements
	    private static <T> Predicate<T> distinct() {
	        var set = new java.util.HashSet<T>();
	        return set::add; // Method Reference
	    }

	 
	}


