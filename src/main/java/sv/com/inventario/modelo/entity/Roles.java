package sv.com.inventario.modelo.entity;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Roles extends AbstractBaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codi_role")
	private Long codi_role;

	@Column(name = "nomb_role")
	private String nomb_role;

	@Column(name = "desc_role")
	private String desc_role;

	public Roles() {
	}

	public Roles(Long codi_role, String nomb_role, String desc_role) {
		super();
		this.codi_role = codi_role;
		this.nomb_role = nomb_role;
		this.desc_role = desc_role;
	}

	public Long getCodi_role() {
		return codi_role;
	}

	public void setCodi_role(Long codi_role) {
		this.codi_role = codi_role;
	}

	public String getNomb_role() {
		return nomb_role;
	}

	public void setNomb_role(String nomb_role) {
		this.nomb_role = nomb_role;
	}

	public String getDesc_role() {
		return desc_role;
	}

	public void setDesc_role(String desc_role) {
		this.desc_role = desc_role;
	}

}
