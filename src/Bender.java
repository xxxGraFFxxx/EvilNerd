import java.util.Random; //используем генератор случайных чисел;
public class Bender {
    public static void main(String[] args) {
        Random roulette = new Random(); //инциализируем генератор случайных чисел;
        int num[] = new int [33]; //создали массив в которм будут элеменыты от 0 до 32;
        for (int i = 0; i < 1000; i++) //в цыкле фор мы крутим рулекту 1000 раз и к каждому выповшему числу мы добавляем едницу
        {
            ++num[roulette.nextInt(33)];
                    }
        System.out.println("Номер \t Число"); //Шапка таблицы
                for (int i = 0; i < num.length; i++) // выводим наш цыклы на экран от 0 до конца массива
                {
                    System.out.println(i + "\t" +num[i]); //
                }






    }
}

