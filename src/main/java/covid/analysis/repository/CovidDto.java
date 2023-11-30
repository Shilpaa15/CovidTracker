package covid.analysis.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import covid.analysis.model.CovidData;

@Repository
public interface CovidDto extends JpaRepository<CovidData,Integer>{

}




