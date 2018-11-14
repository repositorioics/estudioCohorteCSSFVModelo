package ni.com.sts.estudioCohorteCSSFV.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "resultado_examen_muestra")
public class ResultadoExamenMuestra implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int secResultadoExamen;
	private OrdenLaboratorio ordenLaboratorio;
	private String codigoMuestra;
	private Short usuarioBioanalista;
	private String fechaHoraReporte;
	private Character estado;
	
	
	@Id
	@SequenceGenerator(name = "id_resultado_examen_sec", sequenceName = "resultado_examen_muestra_sec_resultado_examen_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_resultado_examen_sec")
	@Column(name = "sec_resultado_examen", unique = true, nullable = false)
	public int getSecResultadoExamen() {
		return secResultadoExamen;
	}
	public void setSecResultadoExamen(int secResultadoExamen) {
		this.secResultadoExamen = secResultadoExamen;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sec_orden_laboratorio", nullable = false)
	public OrdenLaboratorio getOrdenLaboratorio() {
		return ordenLaboratorio;
	}
	public void setOrdenLaboratorio(OrdenLaboratorio ordenLaboratorio) {
		this.ordenLaboratorio = ordenLaboratorio;
	}
	
	@Column(name = "codigo_muestra", length = 50)
	public String getCodigoMuestra() {
		return codigoMuestra;
	}
	public void setCodigoMuestra(String codigoMuestra) {
		this.codigoMuestra = codigoMuestra;
	}
	
	@Column(name = "usuario_bioanalista")
	public Short getUsuarioBioanalista() {
		return usuarioBioanalista;
	}
	public void setUsuarioBioanalista(Short usuarioBioanalista) {
		this.usuarioBioanalista = usuarioBioanalista;
	}
	
	@Column(name = "fecha_hora_reporte", length = 19)
	public String getFechaHoraReporte() {
		return fechaHoraReporte;
	}
	public void setFechaHoraReporte(String fechaHoraReporte) {
		this.fechaHoraReporte = fechaHoraReporte;
	}
	
	@Column(name = "estado", length = 1)
	public Character getEstado() {
		return estado;
	}
	public void setEstado(Character estado) {
		this.estado = estado;
	}	

}
