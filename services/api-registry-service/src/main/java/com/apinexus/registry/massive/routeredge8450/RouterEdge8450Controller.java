package com.apinexus.registry.massive.routeredge8450;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routeredge8450")
public class RouterEdge8450Controller {
    private final RouterEdge8450Service service;
    
    public RouterEdge8450Controller(RouterEdge8450Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterEdge8450> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterEdge8450 create(@RequestBody RouterEdge8450 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterEdge8450";
    }
}
