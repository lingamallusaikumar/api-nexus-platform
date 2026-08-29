package com.apinexus.registry.massive.centralmap6308;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralmap6308")
public class CentralMap6308Controller {
    private final CentralMap6308Service service;
    
    public CentralMap6308Controller(CentralMap6308Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralMap6308> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralMap6308 create(@RequestBody CentralMap6308 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralMap6308";
    }
}
