package com.apinexus.registry.massive.hybridlog5380;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridlog5380")
public class HybridLog5380Controller {
    private final HybridLog5380Service service;
    
    public HybridLog5380Controller(HybridLog5380Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridLog5380> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridLog5380 create(@RequestBody HybridLog5380 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridLog5380";
    }
}
