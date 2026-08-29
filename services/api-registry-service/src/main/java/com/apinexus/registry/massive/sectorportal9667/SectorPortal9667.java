package com.apinexus.registry.massive.sectorportal9667;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sectorportal9667s")
public class SectorPortal9667 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String status;
    private String configurationData;
    private LocalDateTime createdAt;
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
