package com.apinexus.registry.massive.onlinelist1610;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinelist1610")
public class OnlineList1610Controller {
    private final OnlineList1610Service service;
    
    public OnlineList1610Controller(OnlineList1610Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineList1610> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineList1610 create(@RequestBody OnlineList1610 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineList1610";
    }
}
