package com.apinexus.registry.massive.digitalheap5901;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalheap5901")
public class DigitalHeap5901Controller {
    private final DigitalHeap5901Service service;
    
    public DigitalHeap5901Controller(DigitalHeap5901Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalHeap5901> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalHeap5901 create(@RequestBody DigitalHeap5901 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalHeap5901";
    }
}
