package kodlamaoi.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaoi.hmrs.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers,Integer>{

}
