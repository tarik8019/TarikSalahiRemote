package newPackage;

public class TarikSalahiPescar {
	
	public String pescar;
	public String mar;
	public int numeroDeVecesAlSemana;
	
	
	public TarikSalahiPescar(String pescar, String mar, int numeroDeVecesAlSemana) {
		super();
		this.pescar = pescar;
		this.mar = mar;
		this.numeroDeVecesAlSemana = numeroDeVecesAlSemana;
	}


	public String getPescar() {
		return pescar;
	}


	public String getMar() {
		return mar;
	}


	public int getNumeroDeVecesAlSemana() {
		return numeroDeVecesAlSemana;
	}


	public void setPescar(String pescar) {
		this.pescar = pescar;
	}


	public void setMar(String mar) {
		this.mar = mar;
	}


	public void setNumeroDeVecesAlSemana(int numeroDeVecesAlSemana) {
		this.numeroDeVecesAlSemana = numeroDeVecesAlSemana;
	}
	
	
	private void generarNombreHobby() {
		for(int i=0;i<1000;i++) {
			System.out.println(pescar);
		}
	}
	
	
	
	
	
	
	
	

}
