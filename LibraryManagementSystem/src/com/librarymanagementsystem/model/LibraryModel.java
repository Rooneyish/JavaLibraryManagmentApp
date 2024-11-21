
package com.librarymanagementsystem.model;

/**
 *
 * @author Ronish Prajapati
 */
public class LibraryModel {
    private int sn;
    private String bookTitle;
    private String authorName;
    private int pages;
    private boolean read;

    public LibraryModel(int sn, String bookTitle, String authorName, int pages, boolean read) {
        this.sn = sn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.pages = pages;
        this.read = read;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

}
