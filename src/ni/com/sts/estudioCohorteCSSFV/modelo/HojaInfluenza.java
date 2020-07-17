package ni.com.sts.estudioCohorteCSSFV.modelo;

// Generated 26-feb-2015 20:57:39 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * HojaInfluenza generated by hbm2java
 */
@Entity
@Table(name = "hoja_influenza", schema = "public")
public class HojaInfluenza implements java.io.Serializable {

	private int secHojaInfluenza;
	private int codExpediente;
	private int numHojaSeguimiento;
	private String fif;
	private String fis;
	private Date fechaInicio;
	private Date fechaCierre;
	private char cerrado;
	private Character estadoCarga;
	private String repeatKey;
	private Integer secHojaConsulta;
	private String usuarioCerroHoja;

	public HojaInfluenza() {
	}

	public HojaInfluenza(int secHojaInfluenza, int codExpediente,
			int numHojaSeguimiento, Date fechaInicio, char cerrado, Character estadoCarga, 
			String repeatKey, Integer secHojaConsulta, String usuarioCerroHoja) {
		this.secHojaInfluenza = secHojaInfluenza;
		this.codExpediente = codExpediente;
		this.numHojaSeguimiento = numHojaSeguimiento;
		this.fechaInicio = fechaInicio;
		this.cerrado = cerrado;
		this.estadoCarga = estadoCarga;
		this.repeatKey = repeatKey;
		this.secHojaConsulta = secHojaConsulta;
		this.usuarioCerroHoja = usuarioCerroHoja;
	}

	public HojaInfluenza(int secHojaInfluenza, int codExpediente,
			int numHojaSeguimiento, String fif, String fis, Date fechaInicio,
			Date fechaCierre, char cerrado, Character estadoCarga, String repeatKey, 
			Integer secHojaConsulta, String usuarioCerroHoja) {
		this.secHojaInfluenza = secHojaInfluenza;
		this.codExpediente = codExpediente;
		this.numHojaSeguimiento = numHojaSeguimiento;
		this.fif = fif;
		this.fis = fis;
		this.fechaInicio = fechaInicio;
		this.fechaCierre = fechaCierre;
		this.cerrado = cerrado;
		this.estadoCarga = estadoCarga;
		this.repeatKey = repeatKey;
		this.secHojaConsulta = secHojaConsulta;
		this.usuarioCerroHoja = usuarioCerroHoja;
	}

	@Id
	@SequenceGenerator(name = "id_hoja_influenza_sec", sequenceName = "hoja_influenza_sec_hoja_influenza_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_hoja_influenza_sec")
	@Column(name = "sec_hoja_influenza", unique = true, nullable = false)
	public int getSecHojaInfluenza() {
		return this.secHojaInfluenza;
	}

	public void setSecHojaInfluenza(int secHojaInfluenza) {
		this.secHojaInfluenza = secHojaInfluenza;
	}

	@Column(name = "cod_expediente", nullable = false)
	public int getCodExpediente() {
		return this.codExpediente;
	}

	public void setCodExpediente(int codExpediente) {
		this.codExpediente = codExpediente;
	}

	@Column(name = "num_hoja_seguimiento", nullable = false)
	public int getNumHojaSeguimiento() {
		return this.numHojaSeguimiento;
	}

	public void setNumHojaSeguimiento(int numHojaSeguimiento) {
		this.numHojaSeguimiento = numHojaSeguimiento;
	}

	@Column(name = "fif", length = 10)
	public String getFif() {
		return this.fif;
	}

	public void setFif(String fif) {
		this.fif = fif;
	}

	@Column(name = "fis", length = 10)
	public String getFis() {
		return this.fis;
	}

	public void setFis(String fis) {
		this.fis = fis;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_inicio", nullable = false, length = 29)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_cierre", length = 29)
	public Date getFechaCierre() {
		return this.fechaCierre;
	}

	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	@Column(name = "cerrado", nullable = false, length = 1)
	public char getCerrado() {
		return cerrado;
	}

	public void setCerrado(char cerrado) {
		this.cerrado = cerrado;
	}
	
	@Column(name = "estado_carga", length = 1)
	public Character getEstadoCarga() {
		return this.estadoCarga;
	}

	public void setEstadoCarga(Character estadoCarga) {
		this.estadoCarga = estadoCarga;
	}

	@Column(name = "repeat_key", length = 10)
	public String getRepeatKey() {
		return this.repeatKey;
	}

	public void setRepeatKey(String repeatKey) {
		this.repeatKey = repeatKey;
	}

	@Column(name = "sec_hoja_consulta")
	public Integer getSecHojaConsulta() {
		return secHojaConsulta;
	}

	public void setSecHojaConsulta(Integer secHojaConsulta) {
		this.secHojaConsulta = secHojaConsulta;
	}
	
	@Column(name = "usuario_cierra_hoja")
	public String getUsuarioCerroHoja() {
		return usuarioCerroHoja;
	}

	public void setUsuarioCerroHoja(String usuarioCerroHoja) {
		this.usuarioCerroHoja = usuarioCerroHoja;
	}
}
