package com.apinexus.registry.massive.closedhandler5147;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedhandler5147")
public class ClosedHandler5147Controller {
    private final ClosedHandler5147Service service;
    
    public ClosedHandler5147Controller(ClosedHandler5147Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedHandler5147> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedHandler5147 create(@RequestBody ClosedHandler5147 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedHandler5147";
    }
}
