package kodlama.io.hmrs.entities.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

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

public class EmployeeConfirm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="system_personel_id")
	private int system_personel_id;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
		
	@Column(name="confirm_data")
	private LocalDate confirmDate;
	
	@Column(name="create_date")
	private LocalDateTime createDate;
	
	@Column(name="active")
	private boolean active=true;

	
	public EmployeeConfirm(int id, int system_personel_id, boolean isConfirmed, LocalDateTime createDate,
			LocalDate confirmDate) {
		this.id = id;
		this.system_personel_id = system_personel_id;
		this.isConfirmed = isConfirmed;
		this.createDate = createDate;
		this.confirmDate = confirmDate;
	}
}
