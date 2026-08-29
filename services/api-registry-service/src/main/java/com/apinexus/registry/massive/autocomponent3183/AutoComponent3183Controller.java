package com.apinexus.registry.massive.autocomponent3183;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autocomponent3183")
public class AutoComponent3183Controller {
    private final AutoComponent3183Service service;
    
    public AutoComponent3183Controller(AutoComponent3183Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoComponent3183> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoComponent3183 create(@RequestBody AutoComponent3183 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoComponent3183";
    }
}
