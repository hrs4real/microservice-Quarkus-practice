package com.app;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

@ApplicationScoped
public class Expensesservice {

    Set<Expenses> expenses= Collections.newSetFromMap(Collections.synchronizedMap(new HashMap<>()));

//    READ
    public Set<Expenses> list(){
        return expenses;
    }
// CREATE
    public Expenses create(Expenses expense)
    {
        expenses.add(expense);
        return expense;
    }
//    DELETE
    public boolean delete(UUID uuid)
    {
        return expenses.removeIf(expense -> expense.getUuid().equals(uuid));
    }
//    UPDATE
    public void update(Expenses expense)
    {
        delete(expense.getUuid());
        create(expense);
    }

}
