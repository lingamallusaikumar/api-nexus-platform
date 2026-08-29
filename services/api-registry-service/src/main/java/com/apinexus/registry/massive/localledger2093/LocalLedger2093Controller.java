package com.apinexus.registry.massive.localledger2093;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localledger2093")
public class LocalLedger2093Controller {
    private final LocalLedger2093Service service;
    
    public LocalLedger2093Controller(LocalLedger2093Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalLedger2093> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalLedger2093 create(@RequestBody LocalLedger2093 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalLedger2093";
    }
}
