package com.apinexus.registry.massive.edgehandler1868;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgehandler1868")
public class EdgeHandler1868Controller {
    private final EdgeHandler1868Service service;
    
    public EdgeHandler1868Controller(EdgeHandler1868Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeHandler1868> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeHandler1868 create(@RequestBody EdgeHandler1868 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeHandler1868";
    }
}
