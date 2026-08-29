package com.apinexus.registry.massive.closedhandler2445;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedhandler2445")
public class ClosedHandler2445Controller {
    private final ClosedHandler2445Service service;
    
    public ClosedHandler2445Controller(ClosedHandler2445Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedHandler2445> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedHandler2445 create(@RequestBody ClosedHandler2445 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedHandler2445";
    }
}
