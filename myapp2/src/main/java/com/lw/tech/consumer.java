package com.lw.tech;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
@Path("/consumer")
public class consumer {


    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAllStudents(){
        return List.of(
                new Student(1,"Jack k",1111,"java"),
                new Student(2,"Henry",2222,"cpp"),
                new Student(3,"Andrew",3333,"python")
        );
    }
}
