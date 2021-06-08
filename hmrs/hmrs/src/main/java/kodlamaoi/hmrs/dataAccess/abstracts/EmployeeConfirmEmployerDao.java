package kodlamaoi.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaoi.hmrs.entities.concretes.EmployeeConfirmEmployers;

public interface EmployeeConfirmEmployerDao extends JpaRepository<EmployeeConfirmEmployers, Integer> {

}
