package com.apinexus.registry.massive.autolink5524;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autolink5524")
public class AutoLink5524Controller {
    private final AutoLink5524Service service;
    
    public AutoLink5524Controller(AutoLink5524Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoLink5524> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoLink5524 create(@RequestBody AutoLink5524 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoLink5524";
    }
}
