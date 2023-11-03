package com.lw.tech;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/HelloLW")
public class HelloLW{

    //    public static void main(String args[]){
//        System.out.println(lwsum());
//    }
    @Path("/sum")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int lwsum(){     //call it from network
        return 5+2;
    }
    @Path("/sayhi")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayhi(){
        return "Hey!";
    }
}