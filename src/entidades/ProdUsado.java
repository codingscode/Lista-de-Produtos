package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdUsado extends Produto {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date datafabric;

	public ProdUsado(String nome, Double preco, Date datafabric) {
		super(nome, preco);
		this.datafabric = datafabric;
	}

	public Date getDatafabric() {
		return datafabric;
	}

	public void setDatafabric(Date datafabric) {
		this.datafabric = datafabric;
	}
	
	@Override
	public String tagPreco() {
	  return getNome()
			 + " (usado) $ "
			 + String.format("%.2f", getPreco())
			 + " (Data de fabricação : "
			 + sdf.format(datafabric)
			 + ")";
	}
	
	
}
