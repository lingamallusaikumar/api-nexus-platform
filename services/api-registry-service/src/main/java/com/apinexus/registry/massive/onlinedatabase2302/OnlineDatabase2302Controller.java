package com.apinexus.registry.massive.onlinedatabase2302;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinedatabase2302")
public class OnlineDatabase2302Controller {
    private final OnlineDatabase2302Service service;
    
    public OnlineDatabase2302Controller(OnlineDatabase2302Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineDatabase2302> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineDatabase2302 create(@RequestBody OnlineDatabase2302 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineDatabase2302";
    }
}
