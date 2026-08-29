package com.apinexus.registry.massive.zonerepo9196;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonerepo9196")
public class ZoneRepo9196Controller {
    private final ZoneRepo9196Service service;
    
    public ZoneRepo9196Controller(ZoneRepo9196Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneRepo9196> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneRepo9196 create(@RequestBody ZoneRepo9196 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneRepo9196";
    }
}
