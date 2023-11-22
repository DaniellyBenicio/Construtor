public class Veiculo {
	String marca;
	String modelo;
	int ano;
	int quilometragem;
	
	public Veiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		if (ano > 0) {
			this.ano = ano;
		}
	}
	
	public Veiculo(String marca, String modelo, int ano, int quilometragem) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.quilometragem = quilometragem;
	}
	
	public void imprimirVeiculo() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Quilometragem: " + this.quilometragem + "km");

	}

}
