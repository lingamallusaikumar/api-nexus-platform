package com.apinexus.registry.massive.staticbuffer8090;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticbuffer8090")
public class StaticBuffer8090Controller {
    private final StaticBuffer8090Service service;
    
    public StaticBuffer8090Controller(StaticBuffer8090Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticBuffer8090> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticBuffer8090 create(@RequestBody StaticBuffer8090 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticBuffer8090";
    }
}
