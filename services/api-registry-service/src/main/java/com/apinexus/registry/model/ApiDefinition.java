package com.apinexus.registry.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "api_definitions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiDefinition {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private String version;

    @Column(nullable = false)
    private String baseUrl;

    @Column(nullable = false)
    private String status; // e.g., DRAFT, PUBLISHED, DEPRECATED

    private String ownerId;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
}

