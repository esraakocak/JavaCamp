package kodlamaoi.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaoi.hmrs.entities.concretes.WorkingPositions;

public interface WorkingPositionsDao extends JpaRepository<WorkingPositions, Integer> {

}
