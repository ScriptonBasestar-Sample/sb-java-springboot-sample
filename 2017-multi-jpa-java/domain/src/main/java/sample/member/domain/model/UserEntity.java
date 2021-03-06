package sample.member.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;
import sample.member.domain.usertype.BCryptUserType;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "T_USER")
@DynamicUpdate
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class UserEntity extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public UserEntity(String username, String realname, String email, String password) {
		this.username = username;
		this.realname = realname;
		this.email = email;
		this.password = password;
	}

	@Column(length = 10, unique = true, nullable = false)
	private String username;

	@Column(length = 10, nullable = false)
	private String realname;

	@Email
	@Column(length = 50, unique = true, nullable = false)
	private String email;

	@Setter
	@Column(length = 20)
	private String nickname;

	@JsonIgnore
	@Column(length = 60, nullable = false)//56
	@Type(type = BCryptUserType.TYPE)
	private String password;

	@Override
	public String toString() {
		return super.buildStringHelper()
				.add("username", username)
				.add("realname", realname)
				.add("email", email)
				.add("nickname", nickname)
				.toString();
	}
}
