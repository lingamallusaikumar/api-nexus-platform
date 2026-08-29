package com.apinexus.registry.massive.closedworker5286;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedworker5286")
public class ClosedWorker5286Controller {
    private final ClosedWorker5286Service service;
    
    public ClosedWorker5286Controller(ClosedWorker5286Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedWorker5286> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedWorker5286 create(@RequestBody ClosedWorker5286 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedWorker5286";
    }
}
