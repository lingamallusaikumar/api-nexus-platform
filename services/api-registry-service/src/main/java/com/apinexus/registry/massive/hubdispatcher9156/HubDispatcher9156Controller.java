package com.apinexus.registry.massive.hubdispatcher9156;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubdispatcher9156")
public class HubDispatcher9156Controller {
    private final HubDispatcher9156Service service;
    
    public HubDispatcher9156Controller(HubDispatcher9156Service service) { this.service = service; }
    
    @GetMapping
    public List<HubDispatcher9156> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubDispatcher9156 create(@RequestBody HubDispatcher9156 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubDispatcher9156";
    }
}
