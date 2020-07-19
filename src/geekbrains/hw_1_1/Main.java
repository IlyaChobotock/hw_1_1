package geekbrains.hw_1_1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Main {

    // 1. Объявление метода main;

    public static void main(String[] args) {

    // 2. Переменные всех пройденных типов данных;

        byte a = 15;
        short b = 2553;
        int c = 1137463647;
        long d = 13234456L;
        float e = -53.165f;
        double f = 335.3215646;
        char g = '\u2142';
        boolean h = true;

        System.out.println("2. Переменные всех типов данных:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        System.out.println("3. Результат вычисление выражения:");
        System.out.println(math(6,1,8,2));

        System.out.println("4. Сумма двух чисел от 10 включительно до 20 включительно:");
        System.out.println(trueSumm(2, 10));

        System.out.println("5. Введенное число:");
        if(positive(-9)){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

        System.out.println("6. Введенное число является положительным:");
        System.out.println(posiNegative(88995));

        System.out.println("7. Приветствие:");
        System.out.println(sayHello("Фанзиль"));

        System.out.println("8. Является ли год високосным:");
        System.out.println(yearV(2020));

    }

    // 3. Метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат

    public static float math (float a, float b, float c, float d) {

        return a * (b + (c / d));

    }

    // 4. Метод, принимающий на вход два целых числа и проверяющий...

    public static boolean trueSumm (int a, int b){

        if (10 <= a + b && a + b <= 20){
            return  true;
        } else {
            return false;
        }

    }

    // 5. Положительное ли число передали или отрицательное

    public static boolean positive (int a){
        return a >= 0;
    }

    // 6. Метод возвращает true, если число отрицательное, и false, если положительное

    public static boolean posiNegative (int a){
        if (a >= 0){
            return  true;
        } else {
            return false;
        }
    }

    // 7. Метод выводит в консоль сообщение «Привет, указанное_имя!»

    public static String sayHello(String name){
        return "Привет (здравствуйте), " + name + "!";
    }

    // 8. Високосный год

    public static boolean yearV (int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
