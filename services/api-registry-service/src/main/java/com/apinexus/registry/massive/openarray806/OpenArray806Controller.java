package com.apinexus.registry.massive.openarray806;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openarray806")
public class OpenArray806Controller {
    private final OpenArray806Service service;
    
    public OpenArray806Controller(OpenArray806Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenArray806> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenArray806 create(@RequestBody OpenArray806 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenArray806";
    }
}
