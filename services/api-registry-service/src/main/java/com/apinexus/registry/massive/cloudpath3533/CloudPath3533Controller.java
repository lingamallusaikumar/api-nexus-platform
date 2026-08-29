package com.apinexus.registry.massive.cloudpath3533;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cloudpath3533")
public class CloudPath3533Controller {
    private final CloudPath3533Service service;
    
    public CloudPath3533Controller(CloudPath3533Service service) { this.service = service; }
    
    @GetMapping
    public List<CloudPath3533> getAll() { return service.findAll(); }
    
    @PostMapping
    public CloudPath3533 create(@RequestBody CloudPath3533 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CloudPath3533";
    }
}
