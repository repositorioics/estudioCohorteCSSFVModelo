package ni.com.sts.estudioCohorteCSSFV.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "histo_ejecucion_proceso", schema = "public")
public class HistEjecucionProcesoAutomatico {

	private int secEjecucion;
	private Date fechaEjecucion;
	private String proceso;
	
	@Id
	@SequenceGenerator(name = "histoejecucion_seq", sequenceName = "histo_ejecucion_proceso_sec_ejecucion_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "histoejecucion_seq")
	@Column(name = "sec_ejecucion", unique = true, nullable = false)	
	public int getSecEjecucion() {
		return secEjecucion;
	}
	public void setSecEjecucion(int secEjecucion) {
		this.secEjecucion = secEjecucion;
	}
	
	@Column(name = "fecha_ejecucion", nullable = false)
	public Date getFechaEjecucion() {
		return fechaEjecucion;
	}
	public void setFechaEjecucion(Date fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}
	
	@Column(name = "proceso", nullable = false, length=16)
	public String getProceso() {
		return proceso;
	}
	public void setProceso(String nombreProceso) {
		this.proceso = nombreProceso;
	}
	
	
	
}
