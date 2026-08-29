package com.apinexus.registry.massive.openengine2446;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openengine2446")
public class OpenEngine2446Controller {
    private final OpenEngine2446Service service;
    
    public OpenEngine2446Controller(OpenEngine2446Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenEngine2446> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenEngine2446 create(@RequestBody OpenEngine2446 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenEngine2446";
    }
}
