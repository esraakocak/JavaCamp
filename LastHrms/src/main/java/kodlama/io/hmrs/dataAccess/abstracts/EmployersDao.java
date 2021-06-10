package kodlama.io.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hmrs.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer>{

}
