package com.github.GuilhermeMendesRosa.contactscrud.repository;

import com.github.GuilhermeMendesRosa.contactscrud.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.TreeSet;

@Repository
public class ContactRepository {

    private Long incremental = 0L;
    private final TreeSet<Contact> table = new TreeSet<>();

    private synchronized Long generateId() {
        this.incremental++;

        return this.incremental;
    }

    public Contact findById(Long id) {
        return this.table.stream()
                .filter(contact -> contact.getId().equals(id))
                .findFirst()
                .get();
    }

    public void add(Contact contact) {
        this.table.add(contact);
    }

    public List<Contact> list() {
        return this.table.stream().toList();
    }

    public Contact edit(Contact newVersion) {
        Contact contactToEdit = this.table.stream()
                .filter(c -> c.getId().equals(newVersion.getId()))
                .findFirst()
                .get();

        contactToEdit.setName(newVersion.getName());
        contactToEdit.setLastName(newVersion.getLastName());
        contactToEdit.setPhone(newVersion.getPhone());
        contactToEdit.setGender(newVersion.getGender());
        contactToEdit.setAddress(newVersion.getAddress());

        return contactToEdit;
    }

}
