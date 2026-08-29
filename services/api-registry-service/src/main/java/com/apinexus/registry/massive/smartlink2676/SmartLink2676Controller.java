package com.apinexus.registry.massive.smartlink2676;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartlink2676")
public class SmartLink2676Controller {
    private final SmartLink2676Service service;
    
    public SmartLink2676Controller(SmartLink2676Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartLink2676> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartLink2676 create(@RequestBody SmartLink2676 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartLink2676";
    }
}
