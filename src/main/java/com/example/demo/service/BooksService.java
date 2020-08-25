package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Books;

public interface BooksService {

	Books saveBook(Books employee);
	Books updateBook(Books book);
	List<Books> getAllBooks();
	Optional<Books> getBook(int id);
	void deleteBook(int bookId);
	
}
