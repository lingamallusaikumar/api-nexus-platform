package com.apinexus.registry.massive.openagent7157;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openagent7157")
public class OpenAgent7157Controller {
    private final OpenAgent7157Service service;
    
    public OpenAgent7157Controller(OpenAgent7157Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenAgent7157> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenAgent7157 create(@RequestBody OpenAgent7157 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenAgent7157";
    }
}
