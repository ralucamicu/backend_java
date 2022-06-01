package ro.unitbv.pweb.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unitbv.pweb.db.entity.ContactAgenda;

import java.util.List;

@Repository
public interface ContactAgendaRepository extends JpaRepository<ContactAgenda, Long> {
    List<ContactAgenda> findAllByOrderByNumeContact();
}
