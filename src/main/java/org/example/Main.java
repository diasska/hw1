package org.example;


public class Main {
    public static void main(String[] args) {


       Book book = context.getBean( Book.class);
       Book book2 = context.getBean("infoNotFound", Book.class);

       System.out.println(book.getTitle());
       System.out.println(book2.getTitle());

       Book book3 = context.getBean(Book.class);
       book3.setTitle("Book3");
       System.out.println(book3.getTitle());
       OwnerBook ownerBook = context.getBean( OwnerBook.class);
       ownerBook.setAge(32);
       System.out.println(ownerBook.getAge());
       ownerBook.setName("Alex");
       System.out.println(ownerBook.getInfo());

    }
}