package com.apinexus.registry.massive.coreengine2734;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/coreengine2734")
public class CoreEngine2734Controller {
    private final CoreEngine2734Service service;
    
    public CoreEngine2734Controller(CoreEngine2734Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreEngine2734> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreEngine2734 create(@RequestBody CoreEngine2734 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreEngine2734";
    }
}
