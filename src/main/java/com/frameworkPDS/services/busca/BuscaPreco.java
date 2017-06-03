package com.frameworkPDS.services.busca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.frameworkPDS.models.Peca;


public class BuscaPreco implements Busca{

	
	private Document documento;
	private List<Peca> pecas = new ArrayList<Peca>();;
	
	public BuscaPreco(String url){
		
		try {

			documento = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public List<Peca> menorPreco(List<Peca> pecas) throws HttpStatusException{
		
		System.out.println("Menor preço");
		pecas.stream()
		//.filter((p1)-> !p1.getNome().contains("Suporte"))
		.sorted((p1, p2)->p1.getPreco().compareTo(p2.getPreco()))
		.forEach((v-> System.out.println(v)));

		return pecas;
		
	}
	
	
	public List<Peca> buscarPeca(String idValor, String idProduto) throws HttpStatusException{
		
		
		Elements htmlElements = documento.getElementsByClass("listagem-box");

		
		ArrayList<Elements> childrenEl = new ArrayList<>();
		ArrayList<Element> lista = new ArrayList<>();
		
	
		for(Element el: htmlElements){
			
			childrenEl.add(el.children());
		}
		
		int soma = 0;
		
		int count = 0;
		
		for(int i = 1;i < childrenEl.size();i++){
			
			Peca peca = new Peca();
			for (Element element : childrenEl.get(i)) {
				
				for (Element el : element.children()) {
					

					for(Element e:el.getElementsByClass("H-titulo")){
						if(e.text().length() != 0){
							peca.setNome(e.text());
							soma ++;
						}
						
					}
					for(Element e:el.getElementsByClass("listagem-marca_avaliacao")){
						if(e.text().length() != 0){
							// limpa o texto
							String[] test = new String[2];
							test = e.text().split(" ");
							peca.setAvaliacao(Integer.parseInt(test[0].replace("(", "")));
							soma ++;
						}
					}
					for(Element e:el.getElementsByClass("listagem-preco")){
						if(e.text().length() != 0){
							
							String valor = e.text().replace("R$", "").trim();
							peca.setPreco(valor.replace(".", "").replace(",", "."));
							soma ++;
							
						}
					}		
					//significa que já preencheu os três campos
					if(soma == 3){
						
						//System.out.println(peca);
						pecas.add(peca);
						count++;
						
						soma = 0;
					}
					
				}
			}
		}

		menorPreco(pecas);
		maisAvaliado(pecas);
		
		return pecas;
	}
	
	
	public List<Peca> maisAvaliado(List<Peca> pecas){
		System.out.println("Mais avaliados");
		pecas.stream()
		.filter((p)-> p.getAvaliacao() != null)
		.sorted((p1, p2)->p2.getAvaliacao().compareTo(p1.getAvaliacao()))
		.forEach((v-> System.out.println(v)));

		return pecas;
		
	}




}
