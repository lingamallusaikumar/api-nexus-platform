package com.apinexus.registry.massive.routerjob4699;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerjob4699")
public class RouterJob4699Controller {
    private final RouterJob4699Service service;
    
    public RouterJob4699Controller(RouterJob4699Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterJob4699> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterJob4699 create(@RequestBody RouterJob4699 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterJob4699";
    }
}
