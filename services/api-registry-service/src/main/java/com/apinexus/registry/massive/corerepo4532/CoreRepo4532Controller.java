package com.apinexus.registry.massive.corerepo4532;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/corerepo4532")
public class CoreRepo4532Controller {
    private final CoreRepo4532Service service;
    
    public CoreRepo4532Controller(CoreRepo4532Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreRepo4532> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreRepo4532 create(@RequestBody CoreRepo4532 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreRepo4532";
    }
}
