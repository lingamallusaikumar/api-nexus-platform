package com.apinexus.registry.massive.staticlink3989;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticlink3989")
public class StaticLink3989Controller {
    private final StaticLink3989Service service;
    
    public StaticLink3989Controller(StaticLink3989Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticLink3989> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticLink3989 create(@RequestBody StaticLink3989 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticLink3989";
    }
}
