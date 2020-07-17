package ni.com.sts.estudioCohorteCSSFV.modelo;

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

@Entity
@Table(name = "hoja_zika", schema = "public")
public class HojaZika implements java.io.Serializable {
	
	private int secHojaZika;
	private int codExpediente;
	private int numHojaSeguimiento;
	private String fif;
	private String fis;
	private Date fechaInicio;
	private Date fechaCierre;
	private char cerrado;
	private String categoria;
	private String sintomaInicial1;
	private String sintomaInicial2;
	private String sintomaInicial3;
	private String sintomaInicial4;
	private Character estadoCarga;
	private String repeatKey;
	private Integer secHojaConsulta; //Cambio agregado el 13/01/2020
	private String usuarioCerroHoja; //Cambio agregado el 22/04/2020
	
	public HojaZika(){
		
	}
	
	public HojaZika(int secHojaZika, int codExpediente,
			int numHojaSeguimiento, Date fechaInicio, char cerrado) {
		this.secHojaZika = secHojaZika;
		this.codExpediente = codExpediente;
		this.numHojaSeguimiento = numHojaSeguimiento;
		this.fechaInicio = fechaInicio;
		this.cerrado = cerrado;
	}


	public HojaZika(int secHojaZika, int codExpediente, int numHojaSeguimiento,
			String fif, String fis, Date fechaInicio, Date fechaCierre,
			char cerrado, String categoria, String sintomaInicial1,
			String sintomaInicial2, String sintomaInicial3,
			String sintomaInicial4, Character estadoCarga, String repeatKey, 
			Integer secHojaConsulta, String usuarioCerroHoja) {
		this.secHojaZika = secHojaZika;
		this.codExpediente = codExpediente;
		this.numHojaSeguimiento = numHojaSeguimiento;
		this.fif = fif;
		this.fis = fis;
		this.fechaInicio = fechaInicio;
		this.fechaCierre = fechaCierre;
		this.cerrado = cerrado;
		this.categoria = categoria;
		this.sintomaInicial1 = sintomaInicial1;
		this.sintomaInicial2 = sintomaInicial2;
		this.sintomaInicial3 = sintomaInicial3;
		this.sintomaInicial4 = sintomaInicial4;
		this.estadoCarga = estadoCarga;
		this.repeatKey = repeatKey;
		this.secHojaConsulta = secHojaConsulta;
		this.usuarioCerroHoja = usuarioCerroHoja;
	}

	@Id
	@SequenceGenerator(name = "id_hoja_zika_sec", sequenceName = "hoja_zika_sec_hoja_zika_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_hoja_zika_sec")
	@Column(name = "sec_hoja_zika", unique = true, nullable = false)
	public int getSecHojaZika() {
		return secHojaZika;
	}

	public void setSecHojaZika(int secHojaZika) {
		this.secHojaZika = secHojaZika;
	}

	@Column(name = "cod_expediente", nullable = false)
	public int getCodExpediente() {
		return codExpediente;
	}

	public void setCodExpediente(int codExpediente) {
		this.codExpediente = codExpediente;
	}

	@Column(name = "num_hoja_seguimiento", nullable = false)
	public int getNumHojaSeguimiento() {
		return numHojaSeguimiento;
	}

	public void setNumHojaSeguimiento(int numHojaSeguimiento) {
		this.numHojaSeguimiento = numHojaSeguimiento;
	}

	@Column(name = "fif", length = 10)
	public String getFif() {
		return fif;
	}

	public void setFif(String fif) {
		this.fif = fif;
	}

	@Column(name = "fis", length = 10)
	public String getFis() {
		return fis;
	}

	public void setFis(String fis) {
		this.fis = fis;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_inicio", nullable = false, length = 29)
	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_cierre", length = 29)
	public Date getFechaCierre() {
		return fechaCierre;
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

	@Column(name = "categoria", length = 1)
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Column(name = "sintoma_inicial1", length = 30)
	public String getSintomaInicial1() {
		return sintomaInicial1;
	}

	public void setSintomaInicial1(String sintomaInicial1) {
		this.sintomaInicial1 = sintomaInicial1;
	}

	@Column(name = "sintoma_inicial2", length = 30)
	public String getSintomaInicial2() {
		return sintomaInicial2;
	}

	public void setSintomaInicial2(String sintomaInicial2) {
		this.sintomaInicial2 = sintomaInicial2;
	}

	@Column(name = "sintoma_inicial3", length = 30)
	public String getSintomaInicial3() {
		return sintomaInicial3;
	}

	public void setSintomaInicial3(String sintomaInicial3) {
		this.sintomaInicial3 = sintomaInicial3;
	}

	@Column(name = "sintoma_inicial4", length = 30)
	public String getSintomaInicial4() {
		return sintomaInicial4;
	}

	public void setSintomaInicial4(String sintomaInicial4) {
		this.sintomaInicial4 = sintomaInicial4;
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
