package test.midterm.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import test.midterm.dto.TaskDto;
import test.midterm.entity.TaskEntity;
import test.midterm.mappers.TaskMapper;
import test.midterm.repository.TaskRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository repo;
    private final TaskMapper mapper;

    public List<TaskDto> getAll() {
        return repo.findAll().stream().map(mapper::toDto).toList();
    }

    public TaskDto create(TaskDto dto) {
        TaskEntity e = repo.save(mapper.toEntity(dto));
        return mapper.toDto(e);
    }

    public TaskDto getById(Long id) {
        TaskEntity e = repo.findById(id).orElseThrow();
        return mapper.toDto(e);
    }

    public void delete(Long id) {
         repo.deleteById(id);
    }

//    public TaskDto update(TaskDto dto) {
//        TaskEntity u = mapper.toEntity(dto);
//
//    }
}
