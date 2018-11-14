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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "seguimiento_zika", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "sec_seg_zika"))
public class SeguimientoZika implements java.io.Serializable {

	private int secHojaZika;
	private int secSegZika;
	private int controlDia;
	private Date fechaSeguimiento;
	private short usuarioMedico;
	private short supervisor;
	private String consultaInicial;
	private String fiebre;
	private String astenia;
	private String malEstadoGral;
	private String escalosfrios;
	private String convulsiones;
	private String cefalea;
	private String rigidezCuello;
	private String dolorRetroocular;
	private String pocoApetito;
	private String nauseas;
	private String vomitos;
	private String diarrea;
	private String dolorAbdominalContinuo;
	private String artralgiaProximal;
	private String artralgiaDistal;
	private String mialgia;
	private String conjuntivitisNoPurulenta;
	private String edemaArtProxMS;
	private String edemaArtDistMS;
	private String edemaArtProxMI;
	private String edemaArtDistMI;
	private String edemaPeriauricular;
	private String adenopatiaCervAnt;
    private String adenopatiaCervPost;
	private String adenopatiaRetroAuricular;
	private String rash;
	private String equimosis;
	private String pruebaTorniquetePos;
	private String epistaxis;
	private String gingivorragia;
	private String petequiasEspontaneas;
	private String hematemesis;
	private String melena;
	private String oftalmoplejia;
	private String dificultadResp;
	private String debilidadMuscMS;
	private String debilidadMuscMI;
	private String parestesiaMS;
	private String parestesiaMI;
	private String paralisisMuscMS;
	private String paralisisMuscMI;
	private String tos;
	private String rinorrea;
	private String dolorGarganta;
	private String prurito;
	
	
	public SeguimientoZika(){
		
	}

	public SeguimientoZika(int secHojaZika, int secSegZika, char controlDia,
			Date fechaSeguimiento, short usuarioMedico, short supervisor,
			String consultaInicial, String fiebre, String astenia,
			String malEstadoGral, String escalosfrios, String convulsiones,
			String cefalea, String rigidezCuello, String dolorRetroocular,
			String pocoApetito, String nauseas, String vomitos, String diarrea,
			String dolorAbdominalContinuo, String artralgiaProximal,
			String artralgiaDistal, String mialgia,
			String conjuntivitisNoPurulenta, String edemaArtProxMS,
			String edemaArtDistMS, String edemaArtProxMI,
			String edemaArtDistMI, String edemaPeriauricular,
			String adenopatiaCervAnt, String adenopatiaCervPost,
			String adenopatiaRetroAuricular, String rash, String equimosis,
			String pruebaTorniquetePos, String epistaxis, String gingivorragia,
			String petequiasEspontaneas, String hematemesis, String melena,
			String oftalmoplejia, String dificultadResp,
			String debilidadMuscMS, String debilidadMuscMI,
			String parestesiaMS, String parestesiaMI, String paralisisMuscMS,
			String paralisisMuscMI, String tos, String rinorrea,
			String dolorGarganta, String prurito) {
		this.secHojaZika = secHojaZika;
		this.secSegZika = secSegZika;
		this.controlDia = controlDia;
		this.fechaSeguimiento = fechaSeguimiento;
		this.usuarioMedico = usuarioMedico;
		this.supervisor = supervisor;
		this.consultaInicial = consultaInicial;
		this.fiebre = fiebre;
		this.astenia = astenia;
		this.malEstadoGral = malEstadoGral;
		this.escalosfrios = escalosfrios;
		this.convulsiones = convulsiones;
		this.cefalea = cefalea;
		this.rigidezCuello = rigidezCuello;
		this.dolorRetroocular = dolorRetroocular;
		this.pocoApetito = pocoApetito;
		this.nauseas = nauseas;
		this.vomitos = vomitos;
		this.diarrea = diarrea;
		this.dolorAbdominalContinuo = dolorAbdominalContinuo;
		this.artralgiaProximal = artralgiaProximal;
		this.artralgiaDistal = artralgiaDistal;
		this.mialgia = mialgia;
		this.conjuntivitisNoPurulenta = conjuntivitisNoPurulenta;
		this.edemaArtProxMS = edemaArtProxMS;
		this.edemaArtDistMS = edemaArtDistMS;
		this.edemaArtProxMI = edemaArtProxMI;
		this.edemaArtDistMI = edemaArtDistMI;
		this.edemaPeriauricular = edemaPeriauricular;
		this.adenopatiaCervAnt = adenopatiaCervAnt;
		this.adenopatiaCervPost = adenopatiaCervPost;
		this.adenopatiaRetroAuricular = adenopatiaRetroAuricular;
		this.rash = rash;
		this.equimosis = equimosis;
		this.pruebaTorniquetePos = pruebaTorniquetePos;
		this.epistaxis = epistaxis;
		this.gingivorragia = gingivorragia;
		this.petequiasEspontaneas = petequiasEspontaneas;
		this.hematemesis = hematemesis;
		this.melena = melena;
		this.oftalmoplejia = oftalmoplejia;
		this.dificultadResp = dificultadResp;
		this.debilidadMuscMS = debilidadMuscMS;
		this.debilidadMuscMI = debilidadMuscMI;
		this.parestesiaMS = parestesiaMS;
		this.parestesiaMI = parestesiaMI;
		this.paralisisMuscMS = paralisisMuscMS;
		this.paralisisMuscMI = paralisisMuscMI;
		this.tos = tos;
		this.rinorrea = rinorrea;
		this.dolorGarganta = dolorGarganta;
		this.prurito = prurito;
	}


	@Column(name = "sec_hoja_zika", nullable = false)
	public int getSecHojaZika() {
		return secHojaZika;
	}


	public void setSecHojaZika(int secHojaZika) {
		this.secHojaZika = secHojaZika;
	}

	@Id
	@SequenceGenerator(name = "id_seg_zika_sec", sequenceName = "seguimiento_zika_sec_seg_zika_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seg_zika_sec")
	@Column(name = "sec_seg_zika", unique = true, nullable = false)
	public int getSecSegZika() {
		return secSegZika;
	}


	public void setSecSegZika(int secSegZika) {
		this.secSegZika = secSegZika;
	}

	@Column(name = "control_dia", nullable = false)
	public int getControlDia() {
		return controlDia;
	}

	public void setControlDia(int controlDia) {
		this.controlDia = controlDia;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_seguimiento", nullable = false, length = 13)
	public Date getFechaSeguimiento() {
		return fechaSeguimiento;
	}


	public void setFechaSeguimiento(Date fechaSeguimiento) {
		this.fechaSeguimiento = fechaSeguimiento;
	}

	@Column(name = "usuario_medico", nullable = false)
	public short getUsuarioMedico() {
		return usuarioMedico;
	}


	public void setUsuarioMedico(short usuarioMedico) {
		this.usuarioMedico = usuarioMedico;
	}

	@Column(name = "supervisor", nullable = false)
	public short getSupervisor() {
		return supervisor;
	}


	public void setSupervisor(short supervisor) {
		this.supervisor = supervisor;
	}

	@Column(name = "consulta_inicial", nullable = false, length = 2)
	public String getConsultaInicial() {
		return consultaInicial;
	}


	public void setConsultaInicial(String consultaInicial) {
		this.consultaInicial = consultaInicial;
	}

	@Column(name = "fiebre", nullable = false, length = 2)
	public String getFiebre() {
		return fiebre;
	}


	public void setFiebre(String fiebre) {
		this.fiebre = fiebre;
	}

	@Column(name = "astenia", nullable = false, length = 2)
	public String getAstenia() {
		return astenia;
	}


	public void setAstenia(String astenia) {
		this.astenia = astenia;
	}

	@Column(name = "mal_estado_gral", nullable = false, length = 2)
	public String getMalEstadoGral() {
		return malEstadoGral;
	}


	public void setMalEstadoGral(String malEstadoGral) {
		this.malEstadoGral = malEstadoGral;
	}

	@Column(name = "escalosfrios", nullable = false, length = 2)
	public String getEscalosfrios() {
		return escalosfrios;
	}


	public void setEscalosfrios(String escalosfrios) {
		this.escalosfrios = escalosfrios;
	}

	@Column(name = "convulsiones", nullable = false, length = 2)
	public String getConvulsiones() {
		return convulsiones;
	}


	public void setConvulsiones(String convulsiones) {
		this.convulsiones = convulsiones;
	}

	@Column(name = "cefalea", nullable = false, length = 2)
	public String getCefalea() {
		return cefalea;
	}


	public void setCefalea(String cefalea) {
		this.cefalea = cefalea;
	}

	@Column(name = "rigidez_cuello", nullable = false, length = 2)
	public String getRigidezCuello() {
		return rigidezCuello;
	}


	public void setRigidezCuello(String rigidezCuello) {
		this.rigidezCuello = rigidezCuello;
	}

	@Column(name = "dolor_retroocular", nullable = false, length = 2)
	public String getDolorRetroocular() {
		return dolorRetroocular;
	}


	public void setDolorRetroocular(String dolorRetroocular) {
		this.dolorRetroocular = dolorRetroocular;
	}

	@Column(name = "poco_apetito", nullable = false, length = 2)
	public String getPocoApetito() {
		return pocoApetito;
	}


	public void setPocoApetito(String pocoApetito) {
		this.pocoApetito = pocoApetito;
	}

	@Column(name = "nauseas", nullable = false, length = 2)
	public String getNauseas() {
		return nauseas;
	}


	public void setNauseas(String nauseas) {
		this.nauseas = nauseas;
	}

	@Column(name = "vomitos", nullable = false, length = 2)
	public String getVomitos() {
		return vomitos;
	}


	public void setVomitos(String vomitos) {
		this.vomitos = vomitos;
	}

	@Column(name = "diarrea", nullable = false, length = 2)
	public String getDiarrea() {
		return diarrea;
	}


	public void setDiarrea(String diarrea) {
		this.diarrea = diarrea;
	}

	@Column(name = "dolor_abdominal_continuo", nullable = false, length = 2)
	public String getDolorAbdominalContinuo() {
		return dolorAbdominalContinuo;
	}


	public void setDolorAbdominalContinuo(String dolorAbdominalContinuo) {
		this.dolorAbdominalContinuo = dolorAbdominalContinuo;
	}

	@Column(name = "artralgia_proximal", nullable = false, length = 2)
	public String getArtralgiaProximal() {
		return artralgiaProximal;
	}


	public void setArtralgiaProximal(String artralgiaProximal) {
		this.artralgiaProximal = artralgiaProximal;
	}

	@Column(name = "artralgia_distal", nullable = false, length = 2)
	public String getArtralgiaDistal() {
		return artralgiaDistal;
	}


	public void setArtralgiaDistal(String artralgiaDistal) {
		this.artralgiaDistal = artralgiaDistal;
	}

	@Column(name = "mialgia", nullable = false, length = 2)
	public String getMialgia() {
		return mialgia;
	}


	public void setMialgia(String mialgia) {
		this.mialgia = mialgia;
	}

	@Column(name = "conjuntivitis_nopurulenta", nullable = false, length = 2)
	public String getConjuntivitisNoPurulenta() {
		return conjuntivitisNoPurulenta;
	}


	public void setConjuntivitisNoPurulenta(String conjuntivitisNoPurulenta) {
		this.conjuntivitisNoPurulenta = conjuntivitisNoPurulenta;
	}

	@Column(name = "edema_art_prox_ms", nullable = false, length = 2)
	public String getEdemaArtProxMS() {
		return edemaArtProxMS;
	}


	public void setEdemaArtProxMS(String edemaArtProxMS) {
		this.edemaArtProxMS = edemaArtProxMS;
	}

	@Column(name = "edema_art_dist_ms", nullable = false, length = 2)
	public String getEdemaArtDistMS() {
		return edemaArtDistMS;
	}


	public void setEdemaArtDistMS(String edemaArtDistMS) {
		this.edemaArtDistMS = edemaArtDistMS;
	}

	@Column(name = "edema_art_prox_mi", nullable = false, length = 2)
	public String getEdemaArtProxMI() {
		return edemaArtProxMI;
	}


	public void setEdemaArtProxMI(String edemaArtProxMI) {
		this.edemaArtProxMI = edemaArtProxMI;
	}

	@Column(name = "edema_art_dist_mi", nullable = false, length = 2)
	public String getEdemaArtDistMI() {
		return edemaArtDistMI;
	}


	public void setEdemaArtDistMI(String edemaArtDistMI) {
		this.edemaArtDistMI = edemaArtDistMI;
	}

	@Column(name = "edema_periauricular", nullable = false, length = 2)
	public String getEdemaPeriauricular() {
		return edemaPeriauricular;
	}


	public void setEdemaPeriauricular(String edemaPeriauricular) {
		this.edemaPeriauricular = edemaPeriauricular;
	}

	@Column(name = "adenopatia_cerv_ant", nullable = false, length = 2)
	public String getAdenopatiaCervAnt() {
		return adenopatiaCervAnt;
	}


	public void setAdenopatiaCervAnt(String adenopatiaCervAnt) {
		this.adenopatiaCervAnt = adenopatiaCervAnt;
	}

	@Column(name = "adenopatia_cerv_post", nullable = false, length = 2)
	public String getAdenopatiaCervPost() {
		return adenopatiaCervPost;
	}


	public void setAdenopatiaCervPost(String adenopatiaCervPost) {
		this.adenopatiaCervPost = adenopatiaCervPost;
	}

	@Column(name = "adenopatia_retro_auricular", nullable = false, length = 2)
	public String getAdenopatiaRetroAuricular() {
		return adenopatiaRetroAuricular;
	}


	public void setAdenopatiaRetroAuricular(String adenopatiaRetroAuricular) {
		this.adenopatiaRetroAuricular = adenopatiaRetroAuricular;
	}

	@Column(name = "rash", nullable = false, length = 2)
	public String getRash() {
		return rash;
	}


	public void setRash(String rash) {
		this.rash = rash;
	}

	@Column(name = "equimosis", nullable = false, length = 2)
	public String getEquimosis() {
		return equimosis;
	}


	public void setEquimosis(String equimosis) {
		this.equimosis = equimosis;
	}

	@Column(name = "prueba_torniquete_pos", nullable = false, length = 2)
	public String getPruebaTorniquetePos() {
		return pruebaTorniquetePos;
	}


	public void setPruebaTorniquetePos(String pruebaTorniquetePos) {
		this.pruebaTorniquetePos = pruebaTorniquetePos;
	}

	@Column(name = "epistaxis", nullable = false, length = 2)
	public String getEpistaxis() {
		return epistaxis;
	}


	public void setEpistaxis(String epistaxis) {
		this.epistaxis = epistaxis;
	}

	@Column(name = "gingivorragia", nullable = false, length = 2)
	public String getGingivorragia() {
		return gingivorragia;
	}


	public void setGingivorragia(String gingivorragia) {
		this.gingivorragia = gingivorragia;
	}

	@Column(name = "petequias_espontaneas", nullable = false, length = 2)
	public String getPetequiasEspontaneas() {
		return petequiasEspontaneas;
	}


	public void setPetequiasEspontaneas(String petequiasEspontaneas) {
		this.petequiasEspontaneas = petequiasEspontaneas;
	}

	@Column(name = "hematemesis", nullable = false, length = 2)
	public String getHematemesis() {
		return hematemesis;
	}


	public void setHematemesis(String hematemesis) {
		this.hematemesis = hematemesis;
	}

	@Column(name = "melena", nullable = false, length = 2)
	public String getMelena() {
		return melena;
	}


	public void setMelena(String melena) {
		this.melena = melena;
	}

	@Column(name = "oftalmoplejia", nullable = false, length = 2)
	public String getOftalmoplejia() {
		return oftalmoplejia;
	}


	public void setOftalmoplejia(String oftalmoplejia) {
		this.oftalmoplejia = oftalmoplejia;
	}

	@Column(name = "dificultad_respiratoria", nullable = false, length = 2)
	public String getDificultadResp() {
		return dificultadResp;
	}


	public void setDificultadResp(String dificultadResp) {
		this.dificultadResp = dificultadResp;
	}

	@Column(name = "debilidad_muscular_ms", nullable = false, length = 2)
	public String getDebilidadMuscMS() {
		return debilidadMuscMS;
	}


	public void setDebilidadMuscMS(String debilidadMuscMS) {
		this.debilidadMuscMS = debilidadMuscMS;
	}

	@Column(name = "debilidad_muscular_mi", nullable = false, length = 2)
	public String getDebilidadMuscMI() {
		return debilidadMuscMI;
	}


	public void setDebilidadMuscMI(String debilidadMuscMI) {
		this.debilidadMuscMI = debilidadMuscMI;
	}

	@Column(name = "parestesia_ms", nullable = false, length = 2)
	public String getParestesiaMS() {
		return parestesiaMS;
	}


	public void setParestesiaMS(String parestesiaMS) {
		this.parestesiaMS = parestesiaMS;
	}

	@Column(name = "parestesia_mi", nullable = false, length = 2)
	public String getParestesiaMI() {
		return parestesiaMI;
	}


	public void setParestesiaMI(String parestesiaMI) {
		this.parestesiaMI = parestesiaMI;
	}

	@Column(name = "paralisis_muscular_ms", nullable = false, length = 2)
	public String getParalisisMuscMS() {
		return paralisisMuscMS;
	}


	public void setParalisisMuscMS(String paralisisMuscMS) {
		this.paralisisMuscMS = paralisisMuscMS;
	}

	@Column(name = "paralisis_muscular_mi", nullable = false, length = 2)
	public String getParalisisMuscMI() {
		return paralisisMuscMI;
	}


	public void setParalisisMuscMI(String paralisisMuscMI) {
		this.paralisisMuscMI = paralisisMuscMI;
	}

	@Column(name = "tos", nullable = false, length = 2)
	public String getTos() {
		return tos;
	}


	public void setTos(String tos) {
		this.tos = tos;
	}

	@Column(name = "rinorrea", nullable = false, length = 2)
	public String getRinorrea() {
		return rinorrea;
	}


	public void setRinorrea(String rinorrea) {
		this.rinorrea = rinorrea;
	}

	@Column(name = "dolor_garganta", nullable = false, length = 2)
	public String getDolorGarganta() {
		return dolorGarganta;
	}


	public void setDolorGarganta(String dolorGarganta) {
		this.dolorGarganta = dolorGarganta;
	}

	@Column(name = "prurito", nullable = false, length = 2)
	public String getPrurito() {
		return prurito;
	}


	public void setPrurito(String prurito) {
		this.prurito = prurito;
	}
	
	
}
