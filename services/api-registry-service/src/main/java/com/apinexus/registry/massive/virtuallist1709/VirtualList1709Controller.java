package com.apinexus.registry.massive.virtuallist1709;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/virtuallist1709")
public class VirtualList1709Controller {
    private final VirtualList1709Service service;
    
    public VirtualList1709Controller(VirtualList1709Service service) { this.service = service; }
    
    @GetMapping
    public List<VirtualList1709> getAll() { return service.findAll(); }
    
    @PostMapping
    public VirtualList1709 create(@RequestBody VirtualList1709 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed VirtualList1709";
    }
}
