package com.apinexus.registry.massive.syncgraph4499;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "syncgraph4499s")
public class SyncGraph4499 {
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
