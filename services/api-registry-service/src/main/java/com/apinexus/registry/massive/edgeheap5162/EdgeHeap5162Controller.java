package com.apinexus.registry.massive.edgeheap5162;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgeheap5162")
public class EdgeHeap5162Controller {
    private final EdgeHeap5162Service service;
    
    public EdgeHeap5162Controller(EdgeHeap5162Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeHeap5162> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeHeap5162 create(@RequestBody EdgeHeap5162 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeHeap5162";
    }
}
