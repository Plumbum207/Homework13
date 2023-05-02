public class Main {
    public static void main(String[] args) {

        Author tolstoy = new Author("Лев", "Толстой");
        Author dostoevsky = new Author("Фёдор", "Достоевский");

        Book warPeace = new Book("Война и мир", tolstoy, 1867);
        Book idiot = new Book("Идиот", dostoevsky, 1869);

        warPeace.setPublishingYear(1869);

        System.out.println(warPeace.toString());
        System.out.println(warPeace.equals(idiot));
        System.out.println(warPeace.hashCode());

    }
}