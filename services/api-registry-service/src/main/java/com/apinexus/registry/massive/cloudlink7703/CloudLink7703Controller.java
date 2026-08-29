package com.apinexus.registry.massive.cloudlink7703;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudlink7703")
public class CloudLink7703Controller {
    private final CloudLink7703Service service;
    
    public CloudLink7703Controller(CloudLink7703Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudLink7703> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudLink7703 create(@RequestBody CloudLink7703 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudLink7703";
    }
}
