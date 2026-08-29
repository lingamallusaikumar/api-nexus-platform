package com.apinexus.registry.massive.centralworker284;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralworker284")
public class CentralWorker284Controller {
    private final CentralWorker284Service service;
    
    public CentralWorker284Controller(CentralWorker284Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralWorker284> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralWorker284 create(@RequestBody CentralWorker284 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralWorker284";
    }
}
