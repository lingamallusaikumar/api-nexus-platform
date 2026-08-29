package com.apinexus.registry.massive.streamrecord957;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamrecord957")
public class StreamRecord957Controller {
    private final StreamRecord957Service service;
    
    public StreamRecord957Controller(StreamRecord957Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamRecord957> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamRecord957 create(@RequestBody StreamRecord957 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamRecord957";
    }
}
