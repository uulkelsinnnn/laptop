public class Main {

    public class MyClass {
        private String name;
        private String surname;
        private int age;
        private String favoriteFood;

        public MyClass(String name, String surname, int age, String favoriteFood) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.favoriteFood = favoriteFood;
        }

        public MyClass(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.favoriteFood = "Не указана";
        }

        public static void main(String[] args) {
            MyClass person1 = new MyClass("Уулкелсин", "Нурдинова", 22, "Пицца");
            MyClass person2 = new MyClass("Диана", "Мамутова", 22,"suchi");

            System.out.println("Имя: " + person1.name);
            System.out.println("Фамилия: " + person1.surname);
            System.out.println("Возраст: " + person1.age);
            System.out.println("Любимая еда: " + person1.favoriteFood);

            System.out.println("\nИмя: " + person2.name);
            System.out.println("Фамилия: " + person2.surname);
            System.out.println("Возраст: " + person2.age);
            System.out.println("Любимая еда: " + person2.favoriteFood);
        }
    }
}