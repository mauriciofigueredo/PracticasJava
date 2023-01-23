
public class Lavadora extends Electrodomestico {

	private double precio;
	private boolean aguaCaliente;
	
	
	public Lavadora(String marca, double potencia) {
		super();
	}
	
	public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
		super();
		this.precio = precio;
		this.aguaCaliente = aguaCaliente;
			
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return super.getTipo();
	}

	@Override
	public void setTipo(String tipo) {
		// TODO Auto-generated method stub
		super.setTipo(tipo);
	}

	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return super.getMarca();
	}

	@Override
	public void setMarca(String marca) {
		// TODO Auto-generated method stub
		super.setMarca(marca);
	}

	@Override
	public double getPotencia() {
		// TODO Auto-generated method stub
		return super.getPotencia();
	}

	@Override
	public void setPotencia(double potencia) {
		// TODO Auto-generated method stub
		super.setPotencia(potencia);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + " precio: " + precio + " agua caliente: " + aguaCaliente);
	}

	@Override
	public double getConsumo(int horas) {
		if(aguaCaliente)
			return super.getConsumo(horas);
		else
			return horas*(super.getPotencia()+super.getPotencia()*0.20);
	}
	
	
}
