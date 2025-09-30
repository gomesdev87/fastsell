package com.fastsell.fastsell.model;

import jakarta.persistence.Entity;
import org.hibernate.annotations.GenericGenerator;
import java.util.UUID;

import javax.annotation.processing.Generated;

@Entity
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private UUID id;

    private String nome;
}
