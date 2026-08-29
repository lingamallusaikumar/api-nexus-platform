package com.apinexus.registry.massive.centralportal2256;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralportal2256")
public class CentralPortal2256Controller {
    private final CentralPortal2256Service service;
    
    public CentralPortal2256Controller(CentralPortal2256Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralPortal2256> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralPortal2256 create(@RequestBody CentralPortal2256 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralPortal2256";
    }
}
