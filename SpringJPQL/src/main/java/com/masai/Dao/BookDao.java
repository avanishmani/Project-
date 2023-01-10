package com.masai.Dao;

import com.masai.model.BookLibrary;

public interface BookDao {
	 BookLibrary info (int Bookid);
	 String CreateBook(BookLibrary book);
	 Boolean DeleteBook(int BookID);
	 String UpdateBook(int BookID);
}
