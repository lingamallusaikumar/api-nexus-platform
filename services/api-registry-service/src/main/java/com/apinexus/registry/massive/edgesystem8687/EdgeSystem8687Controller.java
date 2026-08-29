package com.apinexus.registry.massive.edgesystem8687;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgesystem8687")
public class EdgeSystem8687Controller {
    private final EdgeSystem8687Service service;
    
    public EdgeSystem8687Controller(EdgeSystem8687Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeSystem8687> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeSystem8687 create(@RequestBody EdgeSystem8687 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeSystem8687";
    }
}
