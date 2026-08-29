package com.apinexus.registry.massive.closedbroker592;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedbroker592")
public class ClosedBroker592Controller {
    private final ClosedBroker592Service service;
    
    public ClosedBroker592Controller(ClosedBroker592Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedBroker592> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedBroker592 create(@RequestBody ClosedBroker592 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedBroker592";
    }
}
