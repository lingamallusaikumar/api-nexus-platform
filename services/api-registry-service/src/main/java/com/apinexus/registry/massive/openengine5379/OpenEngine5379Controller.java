package com.apinexus.registry.massive.openengine5379;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openengine5379")
public class OpenEngine5379Controller {
    private final OpenEngine5379Service service;
    
    public OpenEngine5379Controller(OpenEngine5379Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenEngine5379> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenEngine5379 create(@RequestBody OpenEngine5379 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenEngine5379";
    }
}
