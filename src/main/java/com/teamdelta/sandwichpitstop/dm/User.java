package com.teamdelta.sandwichpitstop.dm;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.EqualsAndHashCode;

/**
 * User generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "user", catalog = "sandwich_pit_stop")
@EqualsAndHashCode
public class User implements java.io.Serializable {

	private Integer userId;
	private String username;
	private String type;
	private String password;
	private Set<Sandwich> sandwiches = new HashSet<Sandwich>(0);

	public User() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "username", nullable = false, length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "type", nullable = false, length = 2)
	public String getType() {
		return this.type;
	}
	
	@Transient
	public UserRoleEnum getTypeEnum() {
		return UserRoleEnum.findById(this.type);
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Transient
	public void setType(UserRoleEnum typeEnum) {
		this.type = typeEnum.getId();
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Sandwich> getSandwiches() {
		return this.sandwiches;
	}

	public void setSandwiches(Set<Sandwich> sandwiches) {
		this.sandwiches = sandwiches;
	}

}
