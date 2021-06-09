package kodlama.io.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hmrs.entities.concretes.WorkingPositions;

public interface WorkingPositionsDao extends JpaRepository<WorkingPositions, Integer>{

}
