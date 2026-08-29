package com.apinexus.registry.massive.globalstore9299;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalstore9299")
public class GlobalStore9299Controller {
    private final GlobalStore9299Service service;
    
    public GlobalStore9299Controller(GlobalStore9299Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalStore9299> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalStore9299 create(@RequestBody GlobalStore9299 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalStore9299";
    }
}
