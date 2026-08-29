package com.apinexus.registry.massive.offlineedge4020;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlineedge4020")
public class OfflineEdge4020Controller {
    private final OfflineEdge4020Service service;
    
    public OfflineEdge4020Controller(OfflineEdge4020Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineEdge4020> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineEdge4020 create(@RequestBody OfflineEdge4020 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineEdge4020";
    }
}
