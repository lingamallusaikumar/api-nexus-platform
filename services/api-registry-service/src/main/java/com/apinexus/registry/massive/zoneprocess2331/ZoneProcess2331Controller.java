package com.apinexus.registry.massive.zoneprocess2331;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zoneprocess2331")
public class ZoneProcess2331Controller {
    private final ZoneProcess2331Service service;
    
    public ZoneProcess2331Controller(ZoneProcess2331Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneProcess2331> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneProcess2331 create(@RequestBody ZoneProcess2331 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneProcess2331";
    }
}
