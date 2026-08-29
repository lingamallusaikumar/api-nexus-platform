package com.apinexus.registry.massive.zoneworker9639;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zoneworker9639")
public class ZoneWorker9639Controller {
    private final ZoneWorker9639Service service;
    
    public ZoneWorker9639Controller(ZoneWorker9639Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneWorker9639> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneWorker9639 create(@RequestBody ZoneWorker9639 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneWorker9639";
    }
}
