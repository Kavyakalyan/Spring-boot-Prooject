package com.nagarro.BookManagement.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.BookManagement.model.Book;

/**
 * Dao interface class 
 * 
 * @author kavyakalyan
 *
 */
public interface BookDao extends JpaRepository<Book,Integer>{


}
