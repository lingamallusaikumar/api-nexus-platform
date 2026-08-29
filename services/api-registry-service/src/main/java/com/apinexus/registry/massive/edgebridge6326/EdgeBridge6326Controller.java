package com.apinexus.registry.massive.edgebridge6326;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgebridge6326")
public class EdgeBridge6326Controller {
    private final EdgeBridge6326Service service;
    
    public EdgeBridge6326Controller(EdgeBridge6326Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeBridge6326> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeBridge6326 create(@RequestBody EdgeBridge6326 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeBridge6326";
    }
}
