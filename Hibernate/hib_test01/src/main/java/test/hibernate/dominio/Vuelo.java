package test.hibernate.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//Hibernate tiene en cuenta las clases que van con anotaciones.
@Entity
public class Vuelo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//Esto lo generará HIBERNATE.
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	
	private String aeropuertoOrigen;
	private String aeropuertoDestino;
	private String ciudadOrigen;
	private String ciudadDestino;
	//Le digo que el objeto de abajo me guarda una fecha y quiero guardar toda la info.
	@Temporal(TemporalType.TIMESTAMP)
	private Date partida;
	@Temporal(TemporalType.TIMESTAMP)	
	private Date llegada;
	@Column(precision=10, scale=4)
	private BigDecimal precio;
	private int plazas;
	private int plazasLibres;
	
	public Vuelo() {
		// TODO Auto-generated constructor stub
	}

	public String getAeropuertoOrigen() {
		return aeropuertoOrigen;
	}

	public String getAeropuertoDestino() {
		return aeropuertoDestino;
	}

	public void setAeropuertoDestino(String aeropuertoDestino) {
		this.aeropuertoDestino = aeropuertoDestino;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public Date getPartida() {
		return partida;
	}

	public void setPartida(Date partida) {
		this.partida = partida;
	}

	public Date getLlegada() {
		return llegada;
	}

	public void setLlegada(Date llegada) {
		this.llegada = llegada;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public int getPlazasLibres() {
		return plazasLibres;
	}

	public void setPlazasLibres(int plazasLibres) {
		this.plazasLibres = plazasLibres;
	}

	public void setAeropuertoOdigen(String aeropuertoOdigen) {
		this.aeropuertoOrigen = aeropuertoOdigen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((aeropuertoDestino == null) ? 0 : aeropuertoDestino
						.hashCode());
		result = prime
				* result
				+ ((aeropuertoOrigen == null) ? 0 : aeropuertoOrigen.hashCode());
		result = prime * result + ((llegada == null) ? 0 : llegada.hashCode());
		result = prime * result + ((partida == null) ? 0 : partida.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		if (aeropuertoDestino == null) {
			if (other.aeropuertoDestino != null)
				return false;
		} else if (!aeropuertoDestino.equals(other.aeropuertoDestino))
			return false;
		if (aeropuertoOrigen == null) {
			if (other.aeropuertoOrigen != null)
				return false;
		} else if (!aeropuertoOrigen.equals(other.aeropuertoOrigen))
			return false;
		if (llegada == null) {
			if (other.llegada != null)
				return false;
		} else if (!llegada.equals(other.llegada))
			return false;
		if (partida == null) {
			if (other.partida != null)
				return false;
		} else if (!partida.equals(other.partida))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
	
}
