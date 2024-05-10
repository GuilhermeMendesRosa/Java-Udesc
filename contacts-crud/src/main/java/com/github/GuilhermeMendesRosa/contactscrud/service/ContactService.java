package com.github.GuilhermeMendesRosa.contactscrud.service;

import com.github.GuilhermeMendesRosa.contactscrud.model.Contact;
import com.github.GuilhermeMendesRosa.contactscrud.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;

    public Contact findById(Long id) {
        return this.repository.findById(id);
    }

    public void add(Contact contact) {
        this.repository.add(contact);
    }

    public List<Contact> list() {
        return this.repository.list();
    }

    public Contact edit(Long id, Contact newVersion) {
        newVersion.setId(id);
        return this.repository.edit(newVersion);
    }

}
