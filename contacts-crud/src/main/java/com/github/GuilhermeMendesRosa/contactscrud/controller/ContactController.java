package com.github.GuilhermeMendesRosa.contactscrud.controller;

import com.github.GuilhermeMendesRosa.contactscrud.model.Contact;
import com.github.GuilhermeMendesRosa.contactscrud.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/{id}")
    public ResponseEntity<Contact> findById(@PathVariable Long id) {
        try {
            Contact contact = this.contactService.findById(id);
            return ResponseEntity.ok(contact);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping
    public ResponseEntity add(@RequestBody Contact contact) {
        try {
            this.contactService.add(contact);

            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Contact>> list() {
        try {
            List<Contact> contacts = this.contactService.list();

            return ResponseEntity.ok(contacts);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> edit(@PathVariable Long id, @RequestBody Contact newVersion) {
        try {
            Contact contact = this.contactService.edit(id, newVersion);
            return ResponseEntity.ok(contact);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}
