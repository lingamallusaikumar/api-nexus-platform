package com.apinexus.registry.massive.localarray4772;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localarray4772")
public class LocalArray4772Controller {
    private final LocalArray4772Service service;
    
    public LocalArray4772Controller(LocalArray4772Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalArray4772> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalArray4772 create(@RequestBody LocalArray4772 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalArray4772";
    }
}
