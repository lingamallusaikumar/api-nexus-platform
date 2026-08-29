package com.apinexus.registry.massive.hubtree6494;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubtree6494")
public class HubTree6494Controller {
    private final HubTree6494Service service;
    
    public HubTree6494Controller(HubTree6494Service service) { this.service = service; }
    
    @GetMapping
    public List<HubTree6494> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubTree6494 create(@RequestBody HubTree6494 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubTree6494";
    }
}
