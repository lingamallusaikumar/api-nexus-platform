package com.apinexus.registry.massive.securecache6285;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/securecache6285")
public class SecureCache6285Controller {
    private final SecureCache6285Service service;
    
    public SecureCache6285Controller(SecureCache6285Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureCache6285> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureCache6285 create(@RequestBody SecureCache6285 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureCache6285";
    }
}
