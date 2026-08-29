package com.apinexus.registry.massive.opencomponent4242;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/opencomponent4242")
public class OpenComponent4242Controller {
    private final OpenComponent4242Service service;
    
    public OpenComponent4242Controller(OpenComponent4242Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenComponent4242> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenComponent4242 create(@RequestBody OpenComponent4242 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenComponent4242";
    }
}
