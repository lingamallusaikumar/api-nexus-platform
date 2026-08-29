package com.apinexus.registry.massive.hubqueue4281;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubqueue4281")
public class HubQueue4281Controller {
    private final HubQueue4281Service service;
    
    public HubQueue4281Controller(HubQueue4281Service service) { this.service = service; }
    
    @GetMapping
    public List<HubQueue4281> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubQueue4281 create(@RequestBody HubQueue4281 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubQueue4281";
    }
}
