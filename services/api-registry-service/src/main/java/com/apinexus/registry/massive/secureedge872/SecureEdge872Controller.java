package com.apinexus.registry.massive.secureedge872;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/secureedge872")
public class SecureEdge872Controller {
    private final SecureEdge872Service service;
    
    public SecureEdge872Controller(SecureEdge872Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureEdge872> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureEdge872 create(@RequestBody SecureEdge872 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureEdge872";
    }
}
