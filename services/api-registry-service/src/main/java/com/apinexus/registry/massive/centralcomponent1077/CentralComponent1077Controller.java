package com.apinexus.registry.massive.centralcomponent1077;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralcomponent1077")
public class CentralComponent1077Controller {
    private final CentralComponent1077Service service;
    
    public CentralComponent1077Controller(CentralComponent1077Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralComponent1077> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralComponent1077 create(@RequestBody CentralComponent1077 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralComponent1077";
    }
}
