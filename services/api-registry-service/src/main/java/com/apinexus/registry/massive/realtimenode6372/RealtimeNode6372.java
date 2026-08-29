package com.apinexus.registry.massive.realtimenode6372;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "realtimenode6372s")
public class RealtimeNode6372 {
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
