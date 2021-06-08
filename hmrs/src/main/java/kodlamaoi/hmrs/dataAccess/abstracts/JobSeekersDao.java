package kodlamaoi.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaoi.hmrs.entities.concretes.JobSeekers;

public interface JobSeekersDao extends JpaRepository<JobSeekers, Integer> {

}
