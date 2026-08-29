package com.apinexus.registry.massive.smartvertex5407;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartvertex5407")
public class SmartVertex5407Controller {
    private final SmartVertex5407Service service;
    
    public SmartVertex5407Controller(SmartVertex5407Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartVertex5407> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartVertex5407 create(@RequestBody SmartVertex5407 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartVertex5407";
    }
}
