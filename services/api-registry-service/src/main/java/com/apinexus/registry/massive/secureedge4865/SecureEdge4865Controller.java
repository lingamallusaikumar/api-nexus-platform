package com.apinexus.registry.massive.secureedge4865;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/secureedge4865")
public class SecureEdge4865Controller {
    private final SecureEdge4865Service service;
    
    public SecureEdge4865Controller(SecureEdge4865Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureEdge4865> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureEdge4865 create(@RequestBody SecureEdge4865 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureEdge4865";
    }
}
