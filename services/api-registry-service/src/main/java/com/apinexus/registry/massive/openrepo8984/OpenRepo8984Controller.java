package com.apinexus.registry.massive.openrepo8984;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openrepo8984")
public class OpenRepo8984Controller {
    private final OpenRepo8984Service service;
    
    public OpenRepo8984Controller(OpenRepo8984Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenRepo8984> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenRepo8984 create(@RequestBody OpenRepo8984 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenRepo8984";
    }
}
