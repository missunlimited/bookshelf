package org.bookshelf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 本棚を定義するクラス
 */
public class Bookshelf {
    private int step;
    private int capacity;
    private Book[][] bookshelf;

    public Bookshelf(int step, int capacity) {
        this.step = step;
        this.capacity = capacity;
        this.bookshelf = new Book[this.step][this.capacity];
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Book[][] getBookshelf() {
        return bookshelf;
    }

    public void setBookshelf(Book[][] bookshelf) {
        this.bookshelf = bookshelf;
    }

    /**
     * 名前順ソート関数
     * @param book
     * @return 名前順にソートされた本リスト
     */
    public ArrayList<Book> nameSort(ArrayList<Book> book) {
        Collections.sort(book, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return book;
    }

    /**
     * 価格順ソート関数
     * @param book
     * @return 価格順にソートされた本リスト
     */
    public ArrayList<Book> priceSort(ArrayList<Book> book) {
        Collections.sort(book, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return book;
    }

    /**
     * 発行日順ソート関数
     * @param book
     * @return 発行日順にソートされた本リスト
     */
    public ArrayList<Book> dateSort(ArrayList<Book> book) {
        Collections.sort(book, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getFirstPublicationDate().compareTo(o2.getFirstPublicationDate());
            }
        });
        return book;
    }
}
