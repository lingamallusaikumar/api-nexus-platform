package com.apinexus.registry.massive.centralworker8257;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralworker8257")
public class CentralWorker8257Controller {
    private final CentralWorker8257Service service;
    
    public CentralWorker8257Controller(CentralWorker8257Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralWorker8257> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralWorker8257 create(@RequestBody CentralWorker8257 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralWorker8257";
    }
}
