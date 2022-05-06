package com.james.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.james.savetravels.models.Expense;
import com.james.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	@Autowired //prevents you from having to make a constructor
	private ExpenseRepository expenseRepo;
	
	public List<Expense> AllExpenses(){
		//Business Logic
		return expenseRepo.findAll();
	}
	 
	 // creates an expense
	 public Expense createExpense(Expense expense) {
	     return expenseRepo.save(expense);
	 }
	 
	 // retrieves an expense
	 public Expense findExpense(Long id) {
	     Optional<Expense> optionalExpense = expenseRepo.findById(id);
	     if(optionalExpense.isPresent()) {
	         return optionalExpense.get();
	     } else {
	         return null;
	     }
	 }
	 
	 //updates the expense 
	 public Expense updateExpense(Expense expense) {
	     return expenseRepo.save(expense);
	 }
	 
	 //Get Expense Details 
	public Expense expenseDetails(Long id) {
		return expenseRepo.findById(id).orElse(null);
	}
	
	//must pass in ID to delete art by id 
	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
	}


	
}
