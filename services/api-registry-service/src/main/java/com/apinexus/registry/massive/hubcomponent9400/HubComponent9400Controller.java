package com.apinexus.registry.massive.hubcomponent9400;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubcomponent9400")
public class HubComponent9400Controller {
    private final HubComponent9400Service service;
    
    public HubComponent9400Controller(HubComponent9400Service service) { this.service = service; }
    
    @GetMapping
    public List<HubComponent9400> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubComponent9400 create(@RequestBody HubComponent9400 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubComponent9400";
    }
}
