package com.mycompany.expense;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "app/v1/expense")
public class ExpenseController {
    ExpenseModel model = new ExpenseModel();

    @GetMapping("")
    public String getPage(){

        return "index";
    }


    @GetMapping("/add")
    public Expense createExpense(){
        return model.addExpense(
                20.50f,
                "got a wrap",
                "food"
        );

    }
}
