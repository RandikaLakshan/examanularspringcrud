package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Books;
import com.example.demo.repository.Booksrepository;
import com.example.demo.service.BooksService;

@Service
public class BooksServiceImpl implements BooksService  {

	
	@Autowired
	private Booksrepository booksrepository;
	
	@Override
	
	//add books
	public Books saveBook(Books book) {
		
		return booksrepository.save(book);
	}

	@Override
	//update books
	public Books updateBook(Books book) {
		// TODO Auto-generated method stub
		return booksrepository.save(book);
	}

	@Override
	//get all boks
	public List<Books> getAllBooks() {
		
		
	
		return booksrepository.findAll();
		
		
		
			
			
	}
 
	@Override
	//delete a selected book
	public void deleteBook(int bookId) {
		
		booksrepository.deleteById(bookId);
	}
  
	@Override
	
	//get a book by id to fill the form
public Optional<Books> getBook(int id) {
		
		return  booksrepository.findById(id);
	    
	}

}
