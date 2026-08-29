package com.apinexus.registry.massive.griddispatcher721;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/griddispatcher721")
public class GridDispatcher721Controller {
    private final GridDispatcher721Service service;
    
    public GridDispatcher721Controller(GridDispatcher721Service service) { this.service = service; }
    
    @GetMapping
    public List<GridDispatcher721> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridDispatcher721 create(@RequestBody GridDispatcher721 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridDispatcher721";
    }
}
