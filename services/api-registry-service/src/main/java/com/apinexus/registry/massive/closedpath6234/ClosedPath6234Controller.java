package com.apinexus.registry.massive.closedpath6234;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedpath6234")
public class ClosedPath6234Controller {
    private final ClosedPath6234Service service;
    
    public ClosedPath6234Controller(ClosedPath6234Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedPath6234> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedPath6234 create(@RequestBody ClosedPath6234 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedPath6234";
    }
}
