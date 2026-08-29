package com.apinexus.registry.massive.hubtree6494;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "hubtree6494s")
public class HubTree6494 {
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
