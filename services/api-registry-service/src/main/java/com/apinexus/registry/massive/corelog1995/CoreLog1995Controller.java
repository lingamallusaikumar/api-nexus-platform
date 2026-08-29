package com.apinexus.registry.massive.corelog1995;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/corelog1995")
public class CoreLog1995Controller {
    private final CoreLog1995Service service;
    
    public CoreLog1995Controller(CoreLog1995Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreLog1995> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreLog1995 create(@RequestBody CoreLog1995 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreLog1995";
    }
}
