package com.apinexus.registry.massive.autograph4802;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autograph4802")
public class AutoGraph4802Controller {
    private final AutoGraph4802Service service;
    
    public AutoGraph4802Controller(AutoGraph4802Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoGraph4802> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoGraph4802 create(@RequestBody AutoGraph4802 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoGraph4802";
    }
}
