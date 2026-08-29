package com.apinexus.registry.massive.localthread9625;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localthread9625")
public class LocalThread9625Controller {
    private final LocalThread9625Service service;
    
    public LocalThread9625Controller(LocalThread9625Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalThread9625> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalThread9625 create(@RequestBody LocalThread9625 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalThread9625";
    }
}
