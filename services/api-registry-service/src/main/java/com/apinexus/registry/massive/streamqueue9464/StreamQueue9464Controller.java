package com.apinexus.registry.massive.streamqueue9464;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamqueue9464")
public class StreamQueue9464Controller {
    private final StreamQueue9464Service service;
    
    public StreamQueue9464Controller(StreamQueue9464Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamQueue9464> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamQueue9464 create(@RequestBody StreamQueue9464 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamQueue9464";
    }
}
