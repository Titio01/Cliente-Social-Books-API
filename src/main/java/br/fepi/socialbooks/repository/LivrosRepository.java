package br.fepi.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fepi.socialbooks.model.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{

}
