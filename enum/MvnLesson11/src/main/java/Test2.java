import java.util.Arrays;
// ссылка на д/з : https://docs.google.com/document/d/1E_gU5MrRIwuXk_YlZK2Sw8lFuNhWHg2n6gaiRsLyym0/edit

// Задание 6.
public class Test2 {
    enum Season {
        WINTER("Зима"),
        SPRING("Весна"),
        SUMMER("Лето"),
        FALL("Осень");
        private String title;

        Season (String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return title;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Season.values()));
    }
}