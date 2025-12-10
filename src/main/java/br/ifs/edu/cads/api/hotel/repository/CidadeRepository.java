package br.ifs.edu.cads.api.hotel.repository;

import br.ifs.edu.cads.api.hotel.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}