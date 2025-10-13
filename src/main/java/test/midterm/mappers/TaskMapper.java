package test.midterm.mappers;


import org.mapstruct.Mapper;
import test.midterm.dto.TaskDto;
import test.midterm.entity.TaskEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public class TaskMapper {

//    TaskDto toDto(TaskEntity e);
//    TaskEntity toEntity(TaskDto d);
//    List<TaskDto> toDtoList(List<TaskEntity> list);

    public TaskDto toDto(TaskEntity e) {
        if (e == null) return null;
        return new TaskDto(e.getId(), e.getName(), e.getTask(), e.isState());
    }

    public TaskEntity toEntity(TaskDto d) {
        if (d == null) return null;
        TaskEntity e = new TaskEntity();
        e.setId(d.getId());
        e.setName(d.getName());
        e.setTask(d.getTask());
        e.setState(d.isState());
        return e;
    }

    public void copyToEntity(TaskDto d, TaskEntity e) {
        e.setName(d.getName());
        e.setTask(d.getTask());
    }

}
