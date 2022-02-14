package task1;
/*
Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[]{"DogAndCat", "bigAndSmall", "numberAndLiteral"};

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            StringBuilder result = new StringBuilder();
            char first = name.charAt(0);
            result.append(Character.toLowerCase(first));

            for (int j = 1; j < name.length(); j++) {
                char ch = name.charAt(j);

                if (Character.isUpperCase(ch)) {
                    result.append('_');
                    result.append(Character.toLowerCase(ch));
                } else {
                    result.append(ch);
                }
            }
            names [i] = result.toString();
        }
        System.out.println(Arrays.toString(names));
    }
}