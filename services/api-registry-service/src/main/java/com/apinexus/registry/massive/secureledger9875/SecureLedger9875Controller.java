package com.apinexus.registry.massive.secureledger9875;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/secureledger9875")
public class SecureLedger9875Controller {
    private final SecureLedger9875Service service;
    
    public SecureLedger9875Controller(SecureLedger9875Service service) { this.service = service; }
    
    @GetMapping
    public List<SecureLedger9875> getAll() { return service.findAll(); }
    
    @PostMapping
    public SecureLedger9875 create(@RequestBody SecureLedger9875 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SecureLedger9875";
    }
}
