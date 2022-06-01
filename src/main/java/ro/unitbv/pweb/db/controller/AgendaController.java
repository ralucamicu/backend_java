package ro.unitbv.pweb.db.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unitbv.pweb.db.entity.ContactAgenda;
import ro.unitbv.pweb.db.service.AgendaService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AgendaController {

    private final AgendaService agendaService;

    @GetMapping("/contact/{id}")
    public ContactAgenda fetchContactById(@PathVariable("id") Long id) {
        return agendaService.fetchContactById(id);
    }

    @GetMapping("/contacts")
    public List<ContactAgenda> fetchAllContacts() {
        return agendaService.fetchAllContacts();
    }

    @DeleteMapping("/contact/{id}")
    public ResponseEntity deleteContactById(@PathVariable("id") Long id) {
        try {
            agendaService.deleteContactById(id);
        } catch (Exception ex) {
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.ok().build();
    }

    @PutMapping("/add-contact")
    public ContactAgenda addContact(@RequestBody ContactAgenda newContact) {
        return agendaService.addContact(newContact);
    }

    @PostMapping("/update-contact")
    public ContactAgenda updateContact(@RequestBody ContactAgenda contact) {
        return agendaService.updateContact(contact);
    }

}
