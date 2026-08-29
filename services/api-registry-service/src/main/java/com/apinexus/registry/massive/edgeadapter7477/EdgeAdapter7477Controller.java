package com.apinexus.registry.massive.edgeadapter7477;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgeadapter7477")
public class EdgeAdapter7477Controller {
    private final EdgeAdapter7477Service service;
    
    public EdgeAdapter7477Controller(EdgeAdapter7477Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeAdapter7477> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeAdapter7477 create(@RequestBody EdgeAdapter7477 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeAdapter7477";
    }
}
