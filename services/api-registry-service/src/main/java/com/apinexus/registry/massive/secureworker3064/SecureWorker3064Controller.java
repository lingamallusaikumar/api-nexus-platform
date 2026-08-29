package com.apinexus.registry.massive.secureworker3064;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/secureworker3064")
public class SecureWorker3064Controller {
    private final SecureWorker3064Service service;
    
    public SecureWorker3064Controller(SecureWorker3064Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureWorker3064> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureWorker3064 create(@RequestBody SecureWorker3064 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureWorker3064";
    }
}
