package com.apinexus.registry.massive.staticmodule383;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticmodule383")
public class StaticModule383Controller {
    private final StaticModule383Service service;
    
    public StaticModule383Controller(StaticModule383Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticModule383> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticModule383 create(@RequestBody StaticModule383 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticModule383";
    }
}
