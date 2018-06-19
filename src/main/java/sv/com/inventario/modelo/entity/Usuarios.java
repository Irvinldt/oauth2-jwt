package sv.com.inventario.modelo.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios extends AbstractBaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codi_usua")
	private Long codi_usua;

	@Column(name = "nomb_usua")
	private String nomb_usua;

	@Column(name = "apll_usua")
	private String apll_usua;

	@Column(name = "mail_usua")
	private String mail_usua;

	@Column(name = "cont_usua")
	private String cont_usua;

	public Usuarios() {
	}

	public Usuarios(Long codi_usua, String nomb_usua, String apll_usua, String mail_usua, String cont_usua) {
		super();
		this.codi_usua = codi_usua;
		this.nomb_usua = nomb_usua;
		this.apll_usua = apll_usua;
		this.mail_usua = mail_usua;
		this.cont_usua = cont_usua;
	}

	public Long getCodi_usua() {
		return codi_usua;
	}

	public void setCodi_usua(Long codi_usua) {
		this.codi_usua = codi_usua;
	}

	public String getNomb_usua() {
		return nomb_usua;
	}

	public void setNomb_usua(String nomb_usua) {
		this.nomb_usua = nomb_usua;
	}

	public String getApll_usua() {
		return apll_usua;
	}

	public void setApll_usua(String apll_usua) {
		this.apll_usua = apll_usua;
	}

	public String getMail_usua() {
		return mail_usua;
	}

	public void setMail_usua(String mail_usua) {
		this.mail_usua = mail_usua;
	}

	public String getCont_usua() {
		return cont_usua;
	}

	public void setCont_usua(String cont_usua) {
		this.cont_usua = cont_usua;
	}

}
