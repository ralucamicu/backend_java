package ro.unitbv.pweb.db.service;

import ro.unitbv.pweb.db.entity.ContactAgenda;

import java.util.List;

public interface AgendaService {
    ContactAgenda fetchContactById(Long id);
    List<ContactAgenda> fetchAllContacts();
    void deleteContactById(Long id);
    ContactAgenda addContact(ContactAgenda newContact);
    ContactAgenda updateContact(ContactAgenda newContact);
}
