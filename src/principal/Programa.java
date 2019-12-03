package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.ProdImportado;
import entidades.ProdUsado;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.println("Digite o número de produtos : ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
		  System.out.println("Produto #" + i + " informação :");
		  System.out.print("Comum, usado ou importado (c/u/i)? ");
		  char tipo = sc.next().charAt(0);
		  System.out.println("Nome : ");
		  String nome = sc.next();
		  System.out.println("Preço : ");
		  double preco = sc.nextDouble();
		  if (tipo == 'c') {
			lista.add(new Produto(nome, preco));  
		  }
		  else if(tipo == 'u') {
			System.out.println("Data de fabricação (DD/MM/YYYY):");
			Date datafabric = sdf.parse(sc.next());
		    lista.add(new ProdUsado(nome, preco, datafabric));	  
		  }
		  else {
			System.out.println("Custos alfandegários : ");
			double custoAlfandeg = sc.nextDouble();
			lista.add(new ProdImportado(nome, preco, custoAlfandeg));
		  }
			
		}
		
		System.out.println();
		System.out.println("Tag de Preços : ");
		for (Produto prod : lista) {
		  System.out.println(prod.tagPreco());
		}
		
		
        sc.close();
	}

}
