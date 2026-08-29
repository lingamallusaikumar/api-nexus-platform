package com.apinexus.registry.massive.dynamicmodule8681;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicmodule8681")
public class DynamicModule8681Controller {
    private final DynamicModule8681Service service;
    
    public DynamicModule8681Controller(DynamicModule8681Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicModule8681> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicModule8681 create(@RequestBody DynamicModule8681 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicModule8681";
    }
}
