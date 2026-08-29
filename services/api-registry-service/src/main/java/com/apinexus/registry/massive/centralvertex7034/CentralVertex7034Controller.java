package com.apinexus.registry.massive.centralvertex7034;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralvertex7034")
public class CentralVertex7034Controller {
    private final CentralVertex7034Service service;
    
    public CentralVertex7034Controller(CentralVertex7034Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralVertex7034> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralVertex7034 create(@RequestBody CentralVertex7034 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralVertex7034";
    }
}
