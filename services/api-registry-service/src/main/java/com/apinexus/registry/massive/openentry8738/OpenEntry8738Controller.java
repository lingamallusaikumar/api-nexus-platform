package com.apinexus.registry.massive.openentry8738;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openentry8738")
public class OpenEntry8738Controller {
    private final OpenEntry8738Service service;
    
    public OpenEntry8738Controller(OpenEntry8738Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenEntry8738> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenEntry8738 create(@RequestBody OpenEntry8738 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenEntry8738";
    }
}
