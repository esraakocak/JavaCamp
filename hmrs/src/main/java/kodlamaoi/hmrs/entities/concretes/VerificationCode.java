package kodlamaoi.hmrs.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.*;


import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="verification_codes")
@NoArgsConstructor



public class VerificationCode {
	
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")

	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="activation_date")
	private String activationCode;
	
	@Column(name="email_character")
	private String email;
	
	@Column(name="active")
	private boolean active;
	
	@Column(name="create_date")
	private LocalDateTime createDate;
	

	
	@Column(name="activation_date")
	private LocalDateTime activationDate;

	public VerificationCode(int id, int userId, String activationCode, String email, boolean active,
			LocalDateTime createDate, LocalDateTime activationDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.activationCode = activationCode;
		this.email = email;
		this.active = active;
		this.createDate = createDate;
	
		this.activationDate = activationDate;
	}

}
