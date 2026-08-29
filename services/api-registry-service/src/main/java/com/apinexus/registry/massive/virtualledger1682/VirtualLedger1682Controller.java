package com.apinexus.registry.massive.virtualledger1682;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualledger1682")
public class VirtualLedger1682Controller {
    private final VirtualLedger1682Service service;
    
    public VirtualLedger1682Controller(VirtualLedger1682Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualLedger1682> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualLedger1682 create(@RequestBody VirtualLedger1682 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualLedger1682";
    }
}
