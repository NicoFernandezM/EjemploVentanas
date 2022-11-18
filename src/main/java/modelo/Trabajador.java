package modelo;

public class Trabajador extends Persona {
	private String afp;
	private String isapre;

	public Trabajador () {
		super("Juan", "Ramirez", "123456789");
		afp = "Provida";
		isapre = "Cruz blanca";
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getIsapre() {
		return isapre;
	}

	public void setIsapre(String isapre) {
		this.isapre = isapre;
	}

	public String toString() {
		return ("Nombre: " + super.nombre + " " + super.apellido + "\nRut: " + super.rut +
				"\nAFP: " + this.afp + "\nIsapre: " + this.isapre);
	}
}