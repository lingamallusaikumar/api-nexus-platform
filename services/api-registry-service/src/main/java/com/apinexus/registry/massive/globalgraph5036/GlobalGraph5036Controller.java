package com.apinexus.registry.massive.globalgraph5036;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalgraph5036")
public class GlobalGraph5036Controller {
    private final GlobalGraph5036Service service;
    
    public GlobalGraph5036Controller(GlobalGraph5036Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalGraph5036> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalGraph5036 create(@RequestBody GlobalGraph5036 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalGraph5036";
    }
}
