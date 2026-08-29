package com.apinexus.registry.massive.autocache316;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autocache316")
public class AutoCache316Controller {
    private final AutoCache316Service service;
    
    public AutoCache316Controller(AutoCache316Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoCache316> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoCache316 create(@RequestBody AutoCache316 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoCache316";
    }
}
