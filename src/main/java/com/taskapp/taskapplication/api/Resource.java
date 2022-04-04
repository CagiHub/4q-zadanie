package com.taskapp.taskapplication.api;

import com.taskapp.taskapplication.Task;
import com.taskapp.taskapplication.service.TaskServiceEjb;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Resource {
    @Inject
    private TaskServiceEjb service;

    @GET
    public List getAllTasks() {
        return service.getAll();
    }

    @POST
    public void insertTask(Task task) {
        service.insert(task);
    }

    @GET
    @Path("/{id}")
    public Task getTaskById(@PathParam("id") Integer id) {
        return service.getById(id);
    }

    @DELETE
    @Path("/{id}")
    public void deleteTask(@PathParam("id") Integer id) {
        service.delete(id);
    }
    @PUT
    @Path("/{id}")
    public void updateTask(@PathParam("id") Integer id, Task task) {
        task.setId(id);
        service.update(task);
    }
}
