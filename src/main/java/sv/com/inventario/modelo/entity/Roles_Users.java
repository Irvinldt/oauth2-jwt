package sv.com.inventario.modelo.entity;

import javax.persistence.*;

@Entity
@Table(name = "roles_usuarios")
public class Roles_Users extends AbstractBaseEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codi_rol_usua")
	private Long codi_rol_usua;
	
	@Column(name = "codi_usua")
	private Long codi_usua;

	@Column(name = "codi_role")
	private Long codi_role;

	public Roles_Users(Long codi_usua, Long codi_role) {
		super();
		this.codi_usua = codi_usua;
		this.codi_role = codi_role;
	}

	public Roles_Users() {
	}

	public Long getCodi_usua() {
		return codi_usua;
	}

	public void setCodi_usua(Long codi_usua) {
		this.codi_usua = codi_usua;
	}

	public Long getCodi_role() {
		return codi_role;
	}

	public void setCodi_role(Long codi_role) {
		this.codi_role = codi_role;
	}

}
