package com.apinexus.registry.massive.localvertex5005;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localvertex5005")
public class LocalVertex5005Controller {
    private final LocalVertex5005Service service;
    
    public LocalVertex5005Controller(LocalVertex5005Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalVertex5005> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalVertex5005 create(@RequestBody LocalVertex5005 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalVertex5005";
    }
}
