package com.apinexus.registry.massive.dynamicengine8900;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dynamicengine8900s")
public class DynamicEngine8900 {
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
