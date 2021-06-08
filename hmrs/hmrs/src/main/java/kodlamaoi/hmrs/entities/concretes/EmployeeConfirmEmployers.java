package kodlamaoi.hmrs.entities.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "employee_confirms")
@Inheritance(strategy = InheritanceType.JOINED)

public class EmployeeConfirmEmployers {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	   private int id;
	
	   @Column(name="system_personnel_id")
	   private int system_personnel_id;
	   
       @Column(name="is_confirmed")
	   private boolean is_confirmed;
       
       @Column(name="create_date")
	   private LocalDateTime createDate;
       
       @Column(name="confirm_data")
	   private LocalDate confirmDate;
       
       @Column(name="active")
	   private boolean active=true;
	   
	   
	   
	public EmployeeConfirmEmployers(int id, int system_personnel_id, boolean is_confirmed, LocalDateTime createDate,
			LocalDate confirmDate, boolean active) {
		super();
		this.id = id;
		this.system_personnel_id = system_personnel_id;
		this.is_confirmed = is_confirmed;
		this.createDate = createDate;
		this.confirmDate = confirmDate;
		this.active = active;
	}
	   
	
	   
}
