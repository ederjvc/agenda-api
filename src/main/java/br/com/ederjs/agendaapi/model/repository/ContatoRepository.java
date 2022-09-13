package br.com.ederjs.agendaapi.model.repository;

import br.com.ederjs.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
