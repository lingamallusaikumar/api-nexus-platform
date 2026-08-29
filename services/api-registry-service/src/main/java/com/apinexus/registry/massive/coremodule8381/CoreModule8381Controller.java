package com.apinexus.registry.massive.coremodule8381;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/coremodule8381")
public class CoreModule8381Controller {
    private final CoreModule8381Service service;
    
    public CoreModule8381Controller(CoreModule8381Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreModule8381> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreModule8381 create(@RequestBody CoreModule8381 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreModule8381";
    }
}
