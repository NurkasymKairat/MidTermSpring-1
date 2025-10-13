package test.midterm.api;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import test.midterm.dto.TaskDto;
import test.midterm.entity.TaskEntity;
import test.midterm.service.TaskService;

import java.util.List;

@RequestMapping("/tasks")
@RestController
@AllArgsConstructor
public class TaskApi {
    private final TaskService service;


    @GetMapping
    public List<TaskDto> getAll() {
        return service.getAll();
    }

    @PostMapping
    public TaskDto create(@RequestBody TaskDto dto) {
       return service.create(dto);
    }

    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
