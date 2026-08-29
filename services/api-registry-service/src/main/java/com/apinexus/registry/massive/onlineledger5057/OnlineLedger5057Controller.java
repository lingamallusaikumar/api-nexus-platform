package com.apinexus.registry.massive.onlineledger5057;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlineledger5057")
public class OnlineLedger5057Controller {
    private final OnlineLedger5057Service service;
    
    public OnlineLedger5057Controller(OnlineLedger5057Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineLedger5057> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineLedger5057 create(@RequestBody OnlineLedger5057 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineLedger5057";
    }
}
