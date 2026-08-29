package com.apinexus.registry.massive.staticcomponent2933;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "staticcomponent2933s")
public class StaticComponent2933 {
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
