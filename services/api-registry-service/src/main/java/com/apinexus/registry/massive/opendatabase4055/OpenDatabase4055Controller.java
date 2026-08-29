package com.apinexus.registry.massive.opendatabase4055;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/opendatabase4055")
public class OpenDatabase4055Controller {
    private final OpenDatabase4055Service service;
    
    public OpenDatabase4055Controller(OpenDatabase4055Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenDatabase4055> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenDatabase4055 create(@RequestBody OpenDatabase4055 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenDatabase4055";
    }
}
