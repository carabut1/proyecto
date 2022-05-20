package com.softtek.modelo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ConsultaExamenPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "id_consulta", nullable = false)
	private Consulta consulta;

	@ManyToOne
	@JoinColumn(name = "id_examen", nullable = false)
	private Analiticas examen;

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public Analiticas getExamen() {
		return examen;
	}

	public void setExamen(Analiticas examen) {
		this.examen = examen;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(consulta, examen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultaExamenPK other = (ConsultaExamenPK) obj;
		return Objects.equals(consulta, other.consulta) && Objects.equals(examen, other.examen);
	}

}
