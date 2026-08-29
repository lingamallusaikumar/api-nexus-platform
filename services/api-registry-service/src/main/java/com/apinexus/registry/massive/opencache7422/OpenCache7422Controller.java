package com.apinexus.registry.massive.opencache7422;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/opencache7422")
public class OpenCache7422Controller {
    private final OpenCache7422Service service;
    
    public OpenCache7422Controller(OpenCache7422Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenCache7422> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenCache7422 create(@RequestBody OpenCache7422 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenCache7422";
    }
}
