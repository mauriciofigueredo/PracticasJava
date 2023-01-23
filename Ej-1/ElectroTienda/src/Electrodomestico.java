
public class Electrodomestico {

	public Electrodomestico() {
		// TODO Auto-generated constructor stub
		
	}

	
	public Electrodomestico(String tipo, String marca, double potencia) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.potencia = potencia;
	}
	
	

	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public String toString() {
		return "Electrodomestico [tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + "]";
	}
	
	public double getConsumo(int horas) {
		return horas*potencia;
	}
	
	public double getCostoConsumo(int horas, double costeKwH) {
		return costeKwH*getConsumo(horas);
		
	}
	


	private String tipo;
	private String marca;
	private double potencia;

}
