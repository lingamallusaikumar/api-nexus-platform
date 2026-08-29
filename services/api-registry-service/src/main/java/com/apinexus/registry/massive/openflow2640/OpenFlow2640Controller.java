package com.apinexus.registry.massive.openflow2640;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openflow2640")
public class OpenFlow2640Controller {
    private final OpenFlow2640Service service;
    
    public OpenFlow2640Controller(OpenFlow2640Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenFlow2640> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenFlow2640 create(@RequestBody OpenFlow2640 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenFlow2640";
    }
}
