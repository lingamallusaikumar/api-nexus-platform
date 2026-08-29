package com.apinexus.registry.massive.staticstore7652;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticstore7652")
public class StaticStore7652Controller {
    private final StaticStore7652Service service;
    
    public StaticStore7652Controller(StaticStore7652Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticStore7652> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticStore7652 create(@RequestBody StaticStore7652 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticStore7652";
    }
}
