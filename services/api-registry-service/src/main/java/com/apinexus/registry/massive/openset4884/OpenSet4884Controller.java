package com.apinexus.registry.massive.openset4884;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openset4884")
public class OpenSet4884Controller {
    private final OpenSet4884Service service;
    
    public OpenSet4884Controller(OpenSet4884Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenSet4884> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenSet4884 create(@RequestBody OpenSet4884 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenSet4884";
    }
}
