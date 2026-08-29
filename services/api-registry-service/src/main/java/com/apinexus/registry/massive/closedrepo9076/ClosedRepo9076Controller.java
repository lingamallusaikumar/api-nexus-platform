package com.apinexus.registry.massive.closedrepo9076;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedrepo9076")
public class ClosedRepo9076Controller {
    private final ClosedRepo9076Service service;
    
    public ClosedRepo9076Controller(ClosedRepo9076Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedRepo9076> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedRepo9076 create(@RequestBody ClosedRepo9076 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedRepo9076";
    }
}
