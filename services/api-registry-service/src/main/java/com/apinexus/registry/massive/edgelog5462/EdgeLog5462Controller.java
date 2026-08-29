package com.apinexus.registry.massive.edgelog5462;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgelog5462")
public class EdgeLog5462Controller {
    private final EdgeLog5462Service service;
    
    public EdgeLog5462Controller(EdgeLog5462Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeLog5462> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeLog5462 create(@RequestBody EdgeLog5462 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeLog5462";
    }
}
