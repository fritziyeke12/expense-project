package com.mycompany.expense;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "app/v1/expense")
public class ExpenseController {

    @GetMapping("")
    public String getPage(){
        return "index";
    }

    @GetMapping("/ex")
    public List<Expense> getExpenses(){
        //placeholder
        return List.of(
                new Expense(
                        "1",
                        20.50f,
                        "got a wrap",
                        "food"
                )
        );
    }
}
