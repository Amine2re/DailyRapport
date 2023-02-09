package africa.atps.DailyRapport.repository;

import africa.atps.DailyRapport.domain.Campagne;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampagneRepository extends JpaRepository<Campagne, Long>, JpaSpecificationExecutor<Campagne> {

    @Query("select * from Campagne order by cmpg_date limit 5")
    List<Campagne> findLastFiveCampagne();
}
