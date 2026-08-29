package com.apinexus.registry.massive.corebuffer1019;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/corebuffer1019")
public class CoreBuffer1019Controller {
    private final CoreBuffer1019Service service;
    
    public CoreBuffer1019Controller(CoreBuffer1019Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreBuffer1019> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreBuffer1019 create(@RequestBody CoreBuffer1019 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreBuffer1019";
    }
}
