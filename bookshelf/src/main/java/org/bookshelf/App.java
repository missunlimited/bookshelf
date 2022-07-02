package org.bookshelf;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 本棚クラスを作成する。この本棚は、段数と1段あたりの本の最大保持巣を決められる。
 * 本のクラスは、本の名前、価格、初版発行日　の3パラメータを持っているとする。
 *
 * 本はプログラム内で定義してよい。
 * （名前順 / 価格順 / 発行日順）それぞれでソートして任意の大きさで作成された本棚に格納し、
 * 配置位置と本の一覧を出力できるプログラムを作成せよ。
 * 入りきらなかった本については無視してよい。
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        // 本生成
        Book book1 = new Book("よくわかる社労士 合格テキスト (9) 厚生年金保険法 2021年度 (よくわかる社労士シリーズ)", 2640, "2021/03/06");
        Book book2 = new Book("60歳を迎えた人の厚生年金・国民年金Q&A 2021年6月改訂版: 繰上げ支給から在職老齢年金まで", 1980, "2021/07/10");
        Book book3 = new Book("厚生年金保険法総覧 令和2年10月版", 7150, "2020/11/06");
        Book book4 = new Book("あなたの年金がすべてわかる 2022年版 (人生設計応援book)", 1485, "2021/09/15");
        Book book5 = new Book("国民年金ハンドブック 令和4年度版", 3300, "2022/06/20");

        // ソート用に本を一時的に配列へ格納
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);

        // 本棚生成
        Scanner scanner = new Scanner(System.in);
        System.out.print("本棚の段数を入力 : ");
        int step = Integer.parseInt(scanner.nextLine());
        System.out.print("一段あたりの最大保持数を入力 : ");
        int capacity = Integer.parseInt(scanner.nextLine());
        Bookshelf bookshelf = new Bookshelf(step, capacity);

        // 名前順にソートして本棚へ格納
        System.out.printf("名前順ソート\n=======================================================================================\n");
        bookshelf.nameSort(bookList);
        int countOfNameSort = 0;
        for (int i = 0; i < bookshelf.getStep(); i++) {
            for (int j = 0; j < bookshelf.getCapacity(); j++) {
                if (countOfNameSort < bookList.size()) {
                    bookshelf.getBookshelf()[i][j] = bookList.get(countOfNameSort); // countが本の冊数以内の処理
                    countOfNameSort++;
                } else {
                    bookshelf.getBookshelf()[i][j] = null; // countが本の冊数をオーバーした時の処理
                    countOfNameSort++;
                }
            }
            for (Book nameBook : bookshelf.getBookshelf()[i]) {
                try {
                    System.out.println(nameBook.getName());
                } catch (NullPointerException e) {
                    System.out.println((String) null);
                }
            }
            System.out.println("=======================================================================================");
        }
        System.out.printf("\n");

        // 価格順にソートして本棚へ格納
        System.out.printf("価格順ソート\n=======================================================================================\n");
        bookshelf.priceSort(bookList);
        int countOfPriceSort = 0;
        for (int i = 0; i < bookshelf.getStep(); i++) {
            for (int j = 0; j < bookshelf.getCapacity(); j++) {
                if (countOfPriceSort < bookList.size()) {
                    bookshelf.getBookshelf()[i][j] = bookList.get(countOfPriceSort); // countが本の冊数以内の処理
                    countOfPriceSort++;
                } else {
                    bookshelf.getBookshelf()[i][j] = null; // countが本の冊数をオーバーした時の処理
                    countOfPriceSort++;
                }
            }
            for (Book nameBook : bookshelf.getBookshelf()[i]) {
                try {
                    System.out.println(nameBook.getName());
                } catch (NullPointerException e) {
                    System.out.println((String) null);
                }
            }
            System.out.println("=======================================================================================");
        }
        System.out.printf("\n");

        // 発行日順にソートして本棚へ格納
        System.out.printf("発行日順ソート\n=======================================================================================\n");
        bookshelf.dateSort(bookList);
        int countOfDateSort = 0;
        for (int i = 0; i < bookshelf.getStep(); i++) {
            for (int j = 0; j < bookshelf.getCapacity(); j++) {
                if (countOfDateSort < bookList.size()) {
                    bookshelf.getBookshelf()[i][j] = bookList.get(countOfDateSort); // countが本の冊数以内の処理
                    countOfDateSort++;
                } else {
                    bookshelf.getBookshelf()[i][j] = null; // countが本の冊数をオーバーした時の処理
                    countOfDateSort++;
                }
            }
            for (Book nameBook : bookshelf.getBookshelf()[i]) {
                try {
                    System.out.println(nameBook.getName());
                } catch (NullPointerException e) {
                    System.out.println((String) null);
                }
            }
            System.out.println("=======================================================================================");
        }
        System.out.printf("\n");
    }
}
