package com.apinexus.registry.massive.localpool5742;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localpool5742")
public class LocalPool5742Controller {
    private final LocalPool5742Service service;
    
    public LocalPool5742Controller(LocalPool5742Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalPool5742> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalPool5742 create(@RequestBody LocalPool5742 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalPool5742";
    }
}
