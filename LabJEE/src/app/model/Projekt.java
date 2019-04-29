package app.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="projekt")
public class Projekt {
	
	@OneToMany(mappedBy = "projekty")
	private List<Zadanie> zadania;
	
	@ManyToMany
	@JoinTable(name = "projekt_student", 
		joinColumns = {@JoinColumn(name="projekt_id")},
		inverseJoinColumns = {@JoinColumn(name="student_id")})
	private Set<Student> studenci;
	
	

	public List<Zadanie> getZadania() {
		return zadania;
	}

	public void setZadania(List<Zadanie> zadania) {
		this.zadania = zadania;
	}

	public Set<Student> getStudenci() {
		return studenci;
	}

	public void setStudenci(Set<Student> studenci) {
		this.studenci = studenci;
	}

	@Id
	@GeneratedValue
	@Column(name="projekt_id")
	private Integer projektId;
	
	@Column(nullable = false, length = 50)
	private String nazwa;
	
	@Column(length = 1000)
	private String opis;
	
	@Column(name="dataczas_utworzenia", nullable = false)
	private LocalDateTime dataczasUtworzenia;
	
	@Column(name="data_oddania")
	private LocalDate dataOddania;
	
	public Integer getProjektId() {
		return projektId;
	}
	
	public void setProjektId(Integer projektId) {
		this.projektId = projektId;
	}
	
	public String getNazwa() {
		return nazwa;
	}
	
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public String getOpis() {
		return opis;
	}
	
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	public LocalDateTime getDataczasUtworzenia() {
		return dataczasUtworzenia;
	}
	
	public void setDataczasUtworzenia (LocalDateTime dataczasUtworzenia) {
		this.dataczasUtworzenia = dataczasUtworzenia;
	}
	
	public LocalDate getDataOddania() {
		return dataOddania;
	}
	
	public void setDataOddania(LocalDate dataOddania) {
		this.dataOddania = dataOddania;
	}
}
