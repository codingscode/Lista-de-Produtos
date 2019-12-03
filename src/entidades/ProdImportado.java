package entidades;

public class ProdImportado extends Produto {

	private Double custoAlfandeg;

	public ProdImportado(String nome, Double preco, Double custoAlfandeg) {
		super(nome, preco);
		this.custoAlfandeg = custoAlfandeg;
	}

	public Double getCustoAlfandeg() {
		return custoAlfandeg;
	}

	public void setCustoAlfandeg(Double custoAlfandeg) {
		this.custoAlfandeg = custoAlfandeg;
	}
	
	public Double precoTotal() {
	  return getPreco() + custoAlfandeg;
	}
	
	@Override
	public String tagPreco() {
	  return getNome()
	     + " $ "
	     + String.format("%.2f", precoTotal())
	     + " (Custos Alfandegários : "
	     + String.format("%.2f", custoAlfandeg)
	     + ")";
	}
	
	
}
