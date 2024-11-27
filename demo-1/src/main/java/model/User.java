package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String prenom;	
	@Column(nullable = false , unique = true)
	private String email;
	@Column(nullable = false, columnDefinition = "varchar(40) default 'empolye'")
	private String grade ;
	@Column(nullable = false)
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String email, String grade, String nom, String password, String prenom) {
		super();
		this.id = id;
		this.email = email;
		this.grade = grade;
		this.nom = nom;
		this.password = password;
		this.prenom = prenom;
	}
	
	

}
