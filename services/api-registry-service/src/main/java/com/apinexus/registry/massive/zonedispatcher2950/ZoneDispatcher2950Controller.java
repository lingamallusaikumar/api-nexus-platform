package com.apinexus.registry.massive.zonedispatcher2950;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonedispatcher2950")
public class ZoneDispatcher2950Controller {
    private final ZoneDispatcher2950Service service;
    
    public ZoneDispatcher2950Controller(ZoneDispatcher2950Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneDispatcher2950> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneDispatcher2950 create(@RequestBody ZoneDispatcher2950 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneDispatcher2950";
    }
}
