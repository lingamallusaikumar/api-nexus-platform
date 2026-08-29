package com.apinexus.registry.massive.autonode5591;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autonode5591")
public class AutoNode5591Controller {
    private final AutoNode5591Service service;
    
    public AutoNode5591Controller(AutoNode5591Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoNode5591> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoNode5591 create(@RequestBody AutoNode5591 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoNode5591";
    }
}
