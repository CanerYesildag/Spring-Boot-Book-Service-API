package com.example.service.model;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookId")
    private int bookId;
    @Column(name = "bookName")
    private String bookName;
    @Column(name = "AuthorName")
    private String AuthorName;
    @Column(name = "borrowerName")
    private String borrowerName;
    @Column(name = "borrowerNumber")
    private int borrowerNumber;


    public Book() {
    }



    public int getBookId() {

        return bookId;
    }

    public void setBookId(int bookId) {

        this.bookId = bookId;
    }

    public String getBookName() {

        return bookName;
    }

    public void setBookName(String bookName) {

        this.bookName = bookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getBorrowerName()
    {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {

        this.borrowerName = borrowerName;
    }

    public int getBorrowerNumber()
    {
        return borrowerNumber;
    }

    public void setBorrowerNumber(int borrowerNumber) {

        this.borrowerNumber = borrowerNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", borrowerName='" + borrowerName + '\'' +
                ", borrowerNumber=" + borrowerNumber +
                '}';
    }
}
