package com.apinexus.registry.massive.onlineitem8568;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlineitem8568")
public class OnlineItem8568Controller {
    private final OnlineItem8568Service service;
    
    public OnlineItem8568Controller(OnlineItem8568Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineItem8568> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineItem8568 create(@RequestBody OnlineItem8568 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineItem8568";
    }
}
