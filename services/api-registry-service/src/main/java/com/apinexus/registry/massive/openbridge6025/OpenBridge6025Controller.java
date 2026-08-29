package com.apinexus.registry.massive.openbridge6025;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openbridge6025")
public class OpenBridge6025Controller {
    private final OpenBridge6025Service service;
    
    public OpenBridge6025Controller(OpenBridge6025Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenBridge6025> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenBridge6025 create(@RequestBody OpenBridge6025 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenBridge6025";
    }
}
