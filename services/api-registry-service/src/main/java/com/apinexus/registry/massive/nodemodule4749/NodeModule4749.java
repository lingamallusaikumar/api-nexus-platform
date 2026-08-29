package com.apinexus.registry.massive.nodemodule4749;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "nodemodule4749s")
public class NodeModule4749 {
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
