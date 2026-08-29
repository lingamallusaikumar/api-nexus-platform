package com.apinexus.registry.massive.coreprocessor241;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/coreprocessor241")
public class CoreProcessor241Controller {
    private final CoreProcessor241Service service;
    
    public CoreProcessor241Controller(CoreProcessor241Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreProcessor241> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreProcessor241 create(@RequestBody CoreProcessor241 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreProcessor241";
    }
}
