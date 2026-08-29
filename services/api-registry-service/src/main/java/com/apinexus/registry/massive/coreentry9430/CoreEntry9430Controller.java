package com.apinexus.registry.massive.coreentry9430;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/coreentry9430")
public class CoreEntry9430Controller {
    private final CoreEntry9430Service service;
    
    public CoreEntry9430Controller(CoreEntry9430Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreEntry9430> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreEntry9430 create(@RequestBody CoreEntry9430 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreEntry9430";
    }
}
