package com.apinexus.registry.features.environmentvar;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "environmentvars")
public class EnvironmentVar {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String customField1;
    private String customField2;
    private String customField3;
    private String customField4;
    private String customField5;
    private String customField6;
    private String customField7;
    private String customField8;
    private String customField9;
    // Getters and Setters omitted for brevity but normally generated
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
