package com.apinexus.registry.massive.edgelog2787;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgelog2787")
public class EdgeLog2787Controller {
    private final EdgeLog2787Service service;
    
    public EdgeLog2787Controller(EdgeLog2787Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeLog2787> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeLog2787 create(@RequestBody EdgeLog2787 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeLog2787";
    }
}
