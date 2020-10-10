package com.igorfersantos.springcloudestudo.repository;

import com.igorfersantos.springcloudestudo.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository
        extends JpaRepository<Contact, Long> { }
