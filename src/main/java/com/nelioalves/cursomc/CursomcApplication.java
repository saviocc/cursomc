package com.nelioalves.cursomc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Optional<Categoria> cat1 = categoriaRepository.findById(1);
		 * Optional<Categoria> cat2 = categoriaRepository.findById(2);
		 */
		
		//categoriaRepository.saveAll(Arrays.asList(cat1, cat2));

		/*
		 * Produto prd1 = new Produto(null, "Computador", 2000.); Produto prd2 = new
		 * Produto(null, "Impressora", 800.); Produto prd3 = new Produto(null, "mouse",
		 * 80.);
		 * 
		 * cat1.get().getProdutos().addAll(Arrays.asList(prd1, prd2, prd3));
		 * cat2.get().getProdutos().addAll(Arrays.asList(prd2));
		 * 
		 * prd1.getCategorias().addAll(Arrays.asList(cat1.get()));
		 * prd2.getCategorias().addAll(Arrays.asList(cat1.get(), cat2.get()));
		 * prd3.getCategorias().addAll(Arrays.asList(cat1.get()));
		 * 
		 * produtoRepository.saveAll(Arrays.asList(prd1, prd2, prd3));
		 */
	}

}
