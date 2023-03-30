package com.mycompany.expense;

import java.util.ArrayList;

public class ExpenseModel {
    //props list to hold all expenses and the incrementing id of each expense
    public static ArrayList<Expense> allModels = new ArrayList<Expense>();
    public static Integer id = 1;

    //method to add a new expense to the allModels List
    public Expense addExpense(Float amount, String note, String category){
        Expense newExpense = new Expense(id.toString(), amount, note, category);
        System.out.println(newExpense);
        allModels.add(newExpense);
        ExpenseModel.id++;
        return allModels.get(allModels.size() -1);
    }

}
