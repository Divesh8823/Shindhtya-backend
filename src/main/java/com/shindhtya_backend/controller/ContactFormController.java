package com.shindhtya_backend.controller;

import com.shindhtya_backend.model.ContactForm;
import com.shindhtya_backend.repository.ContactFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://127.0.0.1:5500")  // ✅ Frontend origin allowed
public class ContactFormController {

    @Autowired
    private ContactFormRepository contactFormRepository;

    // GET - All contact form entries (optional, for admin)
    @GetMapping("/contact")
    public List<ContactForm> getAllContactForms() {
        return contactFormRepository.findAll();
    }

    // POST - Save new contact form
    @PostMapping("/contact")
    public String submitContactForm(@RequestBody ContactForm contactForm) {
        contactFormRepository.save(contactForm);
        return "Thank you for contacting us!";
    }
}