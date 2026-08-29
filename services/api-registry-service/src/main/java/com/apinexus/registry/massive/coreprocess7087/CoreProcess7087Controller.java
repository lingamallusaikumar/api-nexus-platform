package com.apinexus.registry.massive.coreprocess7087;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/coreprocess7087")
public class CoreProcess7087Controller {
    private final CoreProcess7087Service service;
    
    public CoreProcess7087Controller(CoreProcess7087Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreProcess7087> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreProcess7087 create(@RequestBody CoreProcess7087 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreProcess7087";
    }
}
