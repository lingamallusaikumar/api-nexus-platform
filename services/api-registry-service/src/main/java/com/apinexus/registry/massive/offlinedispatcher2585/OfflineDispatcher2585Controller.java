package com.apinexus.registry.massive.offlinedispatcher2585;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/offlinedispatcher2585")
public class OfflineDispatcher2585Controller {
    private final OfflineDispatcher2585Service service;
    
    public OfflineDispatcher2585Controller(OfflineDispatcher2585Service service) { this.service = service; }
    
    @GetMapping
    public List<OfflineDispatcher2585> getAll() { return service.findAll(); }
    
    @PostMapping
    public OfflineDispatcher2585 create(@RequestBody OfflineDispatcher2585 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OfflineDispatcher2585";
    }
}
