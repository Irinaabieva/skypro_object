package pro.sky.java.course1.objects;

public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Book prorok = new Book("Пророк", pushkin, 1987);
        System.out.println(prorok.getName()+" " + prorok.getYear()+ " " + prorok.getAuthor());
        Author joan = new Author("Джоан", "Роулинг");
        Book harryPotter = new Book("Гарри Поттер", joan, 2001);
        System.out.println(harryPotter.getName()+" " + harryPotter.getYear()+ " " + harryPotter.getAuthor());
        Book prorok1 = new Book("Пророк", pushkin, 1987);

        System.out.println(prorok.equals(prorok1));
        System.out.println("prorok.getYear() = " + prorok.getYear());
    }

}
