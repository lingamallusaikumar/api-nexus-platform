package com.apinexus.registry.massive.neuralheap9308;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralheap9308")
public class NeuralHeap9308Controller {
    private final NeuralHeap9308Service service;
    
    public NeuralHeap9308Controller(NeuralHeap9308Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralHeap9308> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralHeap9308 create(@RequestBody NeuralHeap9308 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralHeap9308";
    }
}
