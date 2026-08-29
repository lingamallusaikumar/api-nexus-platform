package com.apinexus.registry.massive.edgeledger9203;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgeledger9203")
public class EdgeLedger9203Controller {
    private final EdgeLedger9203Service service;
    
    public EdgeLedger9203Controller(EdgeLedger9203Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeLedger9203> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeLedger9203 create(@RequestBody EdgeLedger9203 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeLedger9203";
    }
}
