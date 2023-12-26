package com.app;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Set;
import java.util.UUID;

@Path("/expenses")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExpensesResource {
    @Inject
    Expensesservice expensesService;

    @GET
    public Set<Expenses> mylist(){
        return expensesService.list();
    }

    @POST
    public Expenses mycreate(Expenses expense)
    {
        return expensesService.create(expense);
    }

    @DELETE
    @Path("{uuid}")
    public boolean mydelete(@PathParam("uuid") UUID uuid){
        return expensesService.delete(uuid);
    }
    @PUT
    public void myupdate(Expenses expense)
    {
       expensesService.update(expense);
    }


}
