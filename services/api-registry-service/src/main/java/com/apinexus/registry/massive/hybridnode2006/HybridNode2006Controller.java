package com.apinexus.registry.massive.hybridnode2006;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridnode2006")
public class HybridNode2006Controller {
    private final HybridNode2006Service service;
    
    public HybridNode2006Controller(HybridNode2006Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridNode2006> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridNode2006 create(@RequestBody HybridNode2006 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridNode2006";
    }
}
