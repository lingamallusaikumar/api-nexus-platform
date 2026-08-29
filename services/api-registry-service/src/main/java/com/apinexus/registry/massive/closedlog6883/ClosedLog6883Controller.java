package com.apinexus.registry.massive.closedlog6883;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedlog6883")
public class ClosedLog6883Controller {
    private final ClosedLog6883Service service;
    
    public ClosedLog6883Controller(ClosedLog6883Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedLog6883> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedLog6883 create(@RequestBody ClosedLog6883 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedLog6883";
    }
}
