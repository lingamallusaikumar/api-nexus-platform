package com.apinexus.registry.massive.centralservice5081;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralservice5081")
public class CentralService5081Controller {
    private final CentralService5081Service service;
    
    public CentralService5081Controller(CentralService5081Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralService5081> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralService5081 create(@RequestBody CentralService5081 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralService5081";
    }
}
