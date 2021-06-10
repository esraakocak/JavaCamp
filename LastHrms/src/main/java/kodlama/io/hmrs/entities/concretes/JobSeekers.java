package kodlama.io.hmrs.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="job_Seekers")
@PrimaryKeyJoinColumn(name = "user_id")

public class JobSeekers extends User{
	
	//@Id
		//@GeneratedValue(strategy = GenerationType.IDENTITY)

		@Column(name="id")
		private int id;
		
		//@Column(name="user_id")
		//private int user_id;
		
		@Column(name="first_name")
		private String first_name;
		
		@Column(name="last_name")
		private String last_name;
		
		@Column(name="identity_number")
		private  String identityNumber;
		
		@Column(name="birth_year")
		private LocalDate birthYear;

		public JobSeekers(int id, String first_name, String last_name, String identityNumber, LocalDate birthYear) {
			super();
			this.id = id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.identityNumber = identityNumber;
			this.birthYear = birthYear;
		}


}
