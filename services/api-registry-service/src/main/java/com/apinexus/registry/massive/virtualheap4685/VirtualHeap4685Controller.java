package com.apinexus.registry.massive.virtualheap4685;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtualheap4685")
public class VirtualHeap4685Controller {
    private final VirtualHeap4685Service service;
    
    public VirtualHeap4685Controller(VirtualHeap4685Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualHeap4685> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualHeap4685 create(@RequestBody VirtualHeap4685 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualHeap4685";
    }
}
