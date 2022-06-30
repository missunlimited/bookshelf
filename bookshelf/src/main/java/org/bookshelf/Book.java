package org.bookshelf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 本を定義するクラス
 */
public class Book {
    private String name;
    private int price;
    private Date firstPublicationDate;

    public Book(String name, int price, String firstPublicationDate) throws ParseException {
        this.name = name;
        this.price = price;
        SimpleDateFormat sdfFirstPublicationDate = new SimpleDateFormat("yyyy/MM/dd");
        this.firstPublicationDate = sdfFirstPublicationDate.parse(firstPublicationDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getFirstPublicationDate() {
        return firstPublicationDate;
    }

    public void setFirstPublicationDate(Date firstPublicationDate) {
        this.firstPublicationDate = firstPublicationDate;
    }
}
