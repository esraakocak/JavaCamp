package kodlama.io.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hmrs.entities.concretes.EmployeeConfirmEmployers;

public interface EmployeeConfirmEmployerDao extends JpaRepository<EmployeeConfirmEmployers, Integer> {

}
