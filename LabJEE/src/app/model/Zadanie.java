package app.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="zadanie")
public class Zadanie {
	
	@ManyToOne
	@JoinColumn(name="projekt_id")
	private Projekt projekt;
	
	public Projekt getProjekt() {
		return projekt;
	}

	public void setProjekt(Projekt projekt) {
		this.projekt = projekt;
	}

	@Id
	@GeneratedValue
	@Column(name="zadanie_id")
	private Integer zadanieId;
	
	@Column(name="projekt_id", nullable = false)
	private Integer projektId;
	
	@Column(nullable = false, length = 50)
	private String nazwa;
	
	@Column(name="kolejnosc")
	private Integer kolejnosc;
	
	@Column(length = 1000)
	private String opis;
	
	@Column(name="dataczas_dodania", nullable = false)
	private LocalDateTime dataczasDodania;
	
	public Integer getZadanieId() {
		return zadanieId;
	}

	public void setZadanieId(Integer zadanieId) {
		this.zadanieId = zadanieId;
	}

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

	public Integer getKolejnosc() {
		return kolejnosc;
	}

	public void setKolejnosc(Integer kolejnosc) {
		this.kolejnosc = kolejnosc;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public LocalDateTime getDataczasDodania() {
		return dataczasDodania;
	}

	public void setDataczasDodania(LocalDateTime dataczasDodania) {
		this.dataczasDodania = dataczasDodania;
	}

}
