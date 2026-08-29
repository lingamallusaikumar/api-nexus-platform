package com.apinexus.registry.massive.opennode62;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/opennode62")
public class OpenNode62Controller {
    private final OpenNode62Service service;
    
    public OpenNode62Controller(OpenNode62Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenNode62> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenNode62 create(@RequestBody OpenNode62 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenNode62";
    }
}
