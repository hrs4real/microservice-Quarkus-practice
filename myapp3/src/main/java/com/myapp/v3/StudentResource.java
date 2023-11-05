package com.myapp.v3;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.Optional;

@Path("/resource")
public class StudentResource {
    @Inject StudentRepository repository;

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int count(){
        return repository.countAllStudents();
    }

    @GET
    @Path("/students")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> Students(){
        return repository.getAllStudents();
    }

    @GET
    @Path("students/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Student> Student(@PathParam("id") int id)
    {
        return repository.getStudent(id);
    }


}
