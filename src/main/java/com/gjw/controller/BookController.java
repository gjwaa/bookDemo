package com.gjw.controller;


import com.gjw.bean.Books;
import com.gjw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list",books);
        return "/allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "/addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook/{bookID}")
    public String toUpdateBook(Model model,@PathVariable("bookID") int id){
        Books books = bookService.queryBookById(id);

        model.addAttribute("book",books);
        return "/updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.err.println(books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/delBook/{bookID}")
    public String delBook(@PathVariable("bookID") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }








}
