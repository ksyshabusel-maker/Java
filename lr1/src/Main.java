public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true){
        System.out.println("1. Проверить, состоит ли строка только из пробелов");
        System.out.println("2. Удалить все гласные буквы из строки");
        System.out.println("3. Класс");
        System.out.println("4. Найти и вывести все слова по шаблону");
        System.out.println("0. Выход");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1:
                // 7. Проверить, состоит ли строка только из пробелов (isBlank()).
                System.out.println("Введите строку");
                String str = scanner.nextLine();
                if(str.isBlank()){
                    System.out.println("Строка пуста");
                }
                else{
                    System.out.println("Строка не пустая");
                }
                break;
            case 2:
                // 7. Удалить все гласные буквы из строки (использовать replaceAll с регулярным выражением).
                System.out.println("Введите строку");
                String line = scanner.nextLine();
                String result = line.replaceAll("[аАеЕёЁуУоОэЭяЯюЮиИыЫ]", "");
                System.out.println(result);
                break;
            case 3:
                Employee[] employees = new Employee[]{ new Employee("Иванов Иван Иваныч", 1000.0), new Employee("Петров Петр Петрович", 1500.0), new Employee("Марина Петровна", 2200.0)};
                Report.generateReport(employees);
                break;
            case 4:
                //  7. Дана строка 'ааа ббб ёёё ззз ййй ААА БББ Ё6 ЗЗЗ ЙЙЙ'. Найти и вывести все слова по шаблону:
                //  любая кириллическая буква любое количество раз.
                String string = "ааа ббб ёёё ззз ййй ААА БББ ЁЁЁ ЗЗЗ ЙЙЙ 666 ";
                Pattern pattern = Pattern.compile("[а-яА-ЯЁ-ё]+ ");
                Matcher matcher = pattern.matcher(string);
                System.out.print("Все паттерны: ");
                while (matcher.find()) {
                    System.out.print(matcher.group() + "; ");
                }
                System.out.println();
                break;
            case 0:
                System.out.println("Выход.");
                scanner.close();
                return;
            default:
                System.out.println("Нет такого пункта.");
        }
    }
}
