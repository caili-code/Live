package cn.jerryshell.liveteaching.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@Entity
public class Report {
	@Id
	@GeneratedValue
	private Integer id;
	@NotBlank
	private String name;
	@NotBlank
	private String phone;
	private Date date;
	@Override
	public String toString() {
		return "Report [id=" + id + ", name=" + name + ", phone=" + phone + ", date=" + date + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
