package com.apinexus.registry.massive.blockcache5322;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "blockcache5322s")
public class BlockCache5322 {
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
