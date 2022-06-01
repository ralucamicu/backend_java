package ro.unitbv.pweb.db.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import ro.unitbv.pweb.db.entity.ContactAgenda;
import ro.unitbv.pweb.db.repository.ContactAgendaRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AgendaServiceImpl implements AgendaService {

    private final ContactAgendaRepository contactAgendaRepository;

    @Override
    public ContactAgenda fetchContactById(Long id) {
        Optional<ContactAgenda> contactAgendaOpt = contactAgendaRepository.findById(id);
        return contactAgendaOpt.isPresent()?contactAgendaOpt.get():null;
    }

    public List<ContactAgenda> fetchAllContacts() {
        return contactAgendaRepository.findAllByOrderByNumeContact();
    }

    public void deleteContactById(Long id) {
        contactAgendaRepository.deleteById(id);
    }

    public ContactAgenda addContact(ContactAgenda newContact) {
        return contactAgendaRepository.save(newContact);
    }

    public ContactAgenda updateContact(ContactAgenda newContact) {
        return contactAgendaRepository.save(newContact);
    }


}
