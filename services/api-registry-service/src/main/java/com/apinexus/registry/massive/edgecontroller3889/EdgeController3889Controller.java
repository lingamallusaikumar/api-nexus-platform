package com.apinexus.registry.massive.edgecontroller3889;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgecontroller3889")
public class EdgeController3889Controller {
    private final EdgeController3889Service service;
    
    public EdgeController3889Controller(EdgeController3889Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeController3889> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeController3889 create(@RequestBody EdgeController3889 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeController3889";
    }
}
