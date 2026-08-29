package com.apinexus.registry.massive.neuralvertex7154;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralvertex7154")
public class NeuralVertex7154Controller {
    private final NeuralVertex7154Service service;
    
    public NeuralVertex7154Controller(NeuralVertex7154Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralVertex7154> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralVertex7154 create(@RequestBody NeuralVertex7154 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralVertex7154";
    }
}
