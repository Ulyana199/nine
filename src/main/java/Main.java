public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ульяна";
        post.passport = "5013 456456";
        post.patronymic = "Игоревна";
        post.phone = "8-913-959-9155";
        post.surname = "Басалаева";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 31;
        post.birthday.month = "июль";
        post.birthday.year = 1990;

    }
}