package com.apinexus.registry.massive.staticdatabase8885;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticdatabase8885")
public class StaticDatabase8885Controller {
    private final StaticDatabase8885Service service;
    
    public StaticDatabase8885Controller(StaticDatabase8885Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticDatabase8885> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticDatabase8885 create(@RequestBody StaticDatabase8885 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticDatabase8885";
    }
}
