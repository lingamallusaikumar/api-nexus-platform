package com.apinexus.registry.massive.realtimerepo1276;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimerepo1276")
public class RealtimeRepo1276Controller {
    private final RealtimeRepo1276Service service;
    
    public RealtimeRepo1276Controller(RealtimeRepo1276Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeRepo1276> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeRepo1276 create(@RequestBody RealtimeRepo1276 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeRepo1276";
    }
}
