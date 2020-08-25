package com.example.demo.controller;

import java.util.List;

 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Books;
import com.example.demo.service.BooksService;
@CrossOrigin
@RequestMapping("books")
@RestController
public class BooksController {

	@Autowired
	private BooksService booksservice;
	

	
	//add books
	@PostMapping("/save")
	public Books save(@RequestBody Books book) {
		
		return booksservice.saveBook(book);
	}
	
	//update a particular book details
	@PutMapping("/update")
	public Books update(@RequestBody Books book) {
	  return booksservice.updateBook(book);
		
	}
	//get all boks
	@GetMapping("/all")
	public List<Books> getAllBook(){
		
		return booksservice.getAllBooks();
	}
	
	//get a book by its id
	@GetMapping("/by/{bookId}")
	public Optional<Books> getBook(@PathVariable(name="bookId") int bookId) {
		 
		return booksservice.getBook(bookId) ;
	}
	
	//delete a book
	@DeleteMapping("/delete/{bookId}")
	public void deleteBook(@PathVariable(name="bookId") int bookId)
	{
	booksservice.deleteBook(bookId);
       
	
}
	

}
