package com.apinexus.registry.massive.batchheap1672;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchheap1672")
public class BatchHeap1672Controller {
    private final BatchHeap1672Service service;
    
    public BatchHeap1672Controller(BatchHeap1672Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchHeap1672> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchHeap1672 create(@RequestBody BatchHeap1672 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchHeap1672";
    }
}
