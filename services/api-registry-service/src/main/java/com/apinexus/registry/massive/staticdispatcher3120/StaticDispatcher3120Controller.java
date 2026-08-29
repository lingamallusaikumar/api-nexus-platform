package com.apinexus.registry.massive.staticdispatcher3120;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticdispatcher3120")
public class StaticDispatcher3120Controller {
    private final StaticDispatcher3120Service service;
    
    public StaticDispatcher3120Controller(StaticDispatcher3120Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticDispatcher3120> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticDispatcher3120 create(@RequestBody StaticDispatcher3120 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticDispatcher3120";
    }
}
