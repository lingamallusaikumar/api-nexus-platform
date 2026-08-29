package com.apinexus.registry.massive.globalledger6518;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalledger6518")
public class GlobalLedger6518Controller {
    private final GlobalLedger6518Service service;
    
    public GlobalLedger6518Controller(GlobalLedger6518Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalLedger6518> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalLedger6518 create(@RequestBody GlobalLedger6518 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalLedger6518";
    }
}
