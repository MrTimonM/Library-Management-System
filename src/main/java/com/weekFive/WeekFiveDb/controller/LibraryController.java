package com.weekFive.WeekFiveDb.controller;

import com.weekFive.WeekFiveDb.service.LibraryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/library")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping("/borrow")
    public String borrowBook(@RequestBody BorrowRequest request) {
        libraryService.borrowBook(request.getMemberId(), request.getBookId());
        return "Book borrowed successfully";
    }

    @PostMapping("/return")
    public String returnBook(@RequestBody BorrowRequest request) {
        libraryService.returnBook(request.getMemberId(), request.getBookId());
        return "Book returned successfully";
    }
}
