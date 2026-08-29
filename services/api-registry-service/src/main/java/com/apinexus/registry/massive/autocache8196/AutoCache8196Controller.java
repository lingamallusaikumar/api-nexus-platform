package com.apinexus.registry.massive.autocache8196;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autocache8196")
public class AutoCache8196Controller {
    private final AutoCache8196Service service;
    
    public AutoCache8196Controller(AutoCache8196Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoCache8196> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoCache8196 create(@RequestBody AutoCache8196 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoCache8196";
    }
}
