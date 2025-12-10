package com.weekFive.WeekFiveDb.service;

import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    private final BookService bookService;
    private final MemberService memberService;

    public LibraryService(BookService bookService, MemberService memberService) {
        this.bookService = bookService;
        this.memberService = memberService;
    }

    public void borrowBook(Long memberId, Long bookId) {
        // ensure member exists
        memberService.getMemberById(memberId);
        // mark book as borrowed
        bookService.borrowBook(bookId);
    }

    public void returnBook(Long memberId, Long bookId) {
        // ensure member exists
        memberService.getMemberById(memberId);
        // mark book as returned
        bookService.returnBook(bookId);
    }
}
