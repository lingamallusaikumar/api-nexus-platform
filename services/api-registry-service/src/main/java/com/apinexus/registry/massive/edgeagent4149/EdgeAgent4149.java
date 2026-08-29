package com.apinexus.registry.massive.edgeagent4149;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "edgeagent4149s")
public class EdgeAgent4149 {
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
