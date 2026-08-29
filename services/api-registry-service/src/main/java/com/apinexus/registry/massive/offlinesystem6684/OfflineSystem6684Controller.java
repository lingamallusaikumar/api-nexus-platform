package com.apinexus.registry.massive.offlinesystem6684;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlinesystem6684")
public class OfflineSystem6684Controller {
    private final OfflineSystem6684Service service;
    
    public OfflineSystem6684Controller(OfflineSystem6684Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineSystem6684> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineSystem6684 create(@RequestBody OfflineSystem6684 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineSystem6684";
    }
}
