package com.apinexus.registry.massive.neuralmap4058;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralmap4058")
public class NeuralMap4058Controller {
    private final NeuralMap4058Service service;
    
    public NeuralMap4058Controller(NeuralMap4058Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralMap4058> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralMap4058 create(@RequestBody NeuralMap4058 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralMap4058";
    }
}
