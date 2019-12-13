class Aspirante {

	private String nombre;
	private String PrimerApeido;
	private String SegundoApellido;
	private String edad;
	private String direccion;
	private String telefono;
	private String correoElectronico;
	private String redesSociales;
	private String carreraDeInteres;
	private String escuelaPrecedencia;
	private String bachilleratoCursado;
	private String folio;

	public Aspirante(String nombre, String primerApeido, String segundoApellido, String edad, String direccion,
			String telefono, String correoElectronico, String redesSociales, String carreraDeInteres,
			String escuelaPrecedencia, String bachilleratoCursado, String folio) {
		super();
		this.nombre = nombre;
		PrimerApeido = primerApeido;
		SegundoApellido = segundoApellido;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		this.redesSociales = redesSociales;
		this.carreraDeInteres = carreraDeInteres;
		this.escuelaPrecedencia = escuelaPrecedencia;
		this.bachilleratoCursado = bachilleratoCursado;
		this.folio = folio;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApeido() {
		return PrimerApeido;
	}

	public void setPrimerApeido(String primerApeido) {
		PrimerApeido = primerApeido;
	}

	public String getSegundoApellido() {
		return SegundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getRedesSociales() {
		return redesSociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

	public String getCarreraDeInteres() {
		return carreraDeInteres;
	}

	public void setCarreraDeInteres(String carreraDeInteres) {
		this.carreraDeInteres = carreraDeInteres;
	}

	public String getEscuelaPrecedencia() {
		return escuelaPrecedencia;
	}

	public void setEscuelaPrecedencia(String escuelaPrecedencia) {
		this.escuelaPrecedencia = escuelaPrecedencia;
	}

	public String getBachilleratoCursado() {
		return bachilleratoCursado;
	}

	public void setBachilleratoCursado(String bachilleratoCursado) {
		this.bachilleratoCursado = bachilleratoCursado;

	}
	
	public String getFolio() {
		return folio;
	}


	public void setFolio(String folio) {
		this.folio = folio;
	}


	@Override
	public String toString() {
		return "Aspirante [nombre=" + nombre + ", PrimerApeido=" + PrimerApeido + ", SegundoApellido=" + SegundoApellido
				+ ", edad=" + edad + ", direccion=" + direccion + ", telefono=" + telefono + ", correoElectronico="
				+ correoElectronico + ", redesSociales=" + redesSociales + ", carreraDeInteres=" + carreraDeInteres
				+ ", escuelaPrecedencia=" + escuelaPrecedencia + ", bachilleratoCursado=" + bachilleratoCursado
				+ ", folio=" + folio + "]";
	}


	
}

class RegistroAspirantes{
	
	Aspirante[] vecAsp = new Aspirante[10];
	
	
	public boolean registrarAspirantes(Aspirante as) {
		for (int i = 0; i < vecAsp.length; i++) {
			if (vecAsp[i]==null) {
				vecAsp[i] = as;
				break;
			}
		}
		return false;
	}
	
	public boolean eliminarAspirante(int posicion) {
		
		for (int i = 0; i < vecAsp.length; i++) {
			if (i==posicion)
				vecAsp[i]=null;
			
		}
		
		return false;
	}

	public void imprimirAspirantes() {
		for (int i = 0; i < vecAsp.length; i++) {
			System.out.println(vecAsp[i]);
		}
	}
	
}




public class PruebaAspirantes {

	public static void main(String[] args) {
		
		Aspirante a1 = new Aspirante("Pedro", "Perez", "Lopez", "18", "Zacatecas", "5555555555", "pedro@gmail.com", "Pedro Perez", "Administracion", "Preparatoria", "C.Ad", "210212");
		Aspirante a2 = new Aspirante("Pablo", "Lopez", "Marquez", "18", "Villanueva", "6666666666", "pablo@gmail.com", "Pablo lopez loza", "Mecatronica", "CBTa", "Física", "545662");
		Aspirante a3 = new Aspirante("Valentin", "Hernandez", "Campos", "18", "Jerez", "7777777777", "valentin@gmail.com", "valentin Campos", "Sistemas", "Colegio", "Física", "78979");
		RegistroAspirantes r = new RegistroAspirantes();
		r.registrarAspirantes(a1);
		r.registrarAspirantes(a2);
		r.registrarAspirantes(a3);
		r.imprimirAspirantes();
		r.eliminarAspirante(2);
		r.imprimirAspirantes();
	}

}