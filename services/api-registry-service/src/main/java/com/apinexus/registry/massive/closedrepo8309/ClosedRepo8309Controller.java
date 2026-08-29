package com.apinexus.registry.massive.closedrepo8309;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedrepo8309")
public class ClosedRepo8309Controller {
    private final ClosedRepo8309Service service;
    
    public ClosedRepo8309Controller(ClosedRepo8309Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedRepo8309> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedRepo8309 create(@RequestBody ClosedRepo8309 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedRepo8309";
    }
}
