package com.shindhtya_backend.repository;

import com.shindhtya_backend.model.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {
    // You can add custom queries here if needed
}