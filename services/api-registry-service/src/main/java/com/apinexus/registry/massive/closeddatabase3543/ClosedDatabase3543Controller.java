package com.apinexus.registry.massive.closeddatabase3543;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closeddatabase3543")
public class ClosedDatabase3543Controller {
    private final ClosedDatabase3543Service service;
    
    public ClosedDatabase3543Controller(ClosedDatabase3543Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedDatabase3543> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedDatabase3543 create(@RequestBody ClosedDatabase3543 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedDatabase3543";
    }
}
