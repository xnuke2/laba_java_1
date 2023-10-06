//Хмыренков
//Рязанский
// 22вп1 вариант 7
import java.util.Scanner;

 class laba_1_java {

    public static void main(String[] args)
    {
        System.out.println("Лабораторная работа 1\n" +
                "Работу выполнили:\n " +
                "Хмыренков Никита,\n " +
                "Рязанский Максим,\n " +
                "вариант 7");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество чисел");
        boolean test = true;
        int lenght=0;
        while(lenght<=0){
            if(in.hasNextInt()){
                lenght = in.nextInt();

                if(lenght<=0){
                    System.out.println("Число некорректно");
                }
            }else{
                System.out.println("Вводиться не целое число");
                in.next();
            }

        }

        int[] nums = new int[lenght];
        for(int i=0;i <nums.length; i++){
            System.out.println("Введите "+(i+1)+" число");
            if(in.hasNextInt())
            {
                nums[i]=in.nextInt();
            }else{
                System.out.println("Вводиться не число");
                i=i-1;
                in.next();
            }
        }
        System.out.println("Числа-полиндромы:");
        for(int i=0;i < nums.length; i++){
            int tmp = nums[i];
            int rezult=0;
            while(tmp!=0){
                rezult =rezult *10+(tmp%10);
                tmp=tmp/10;
            }
            if(rezult == nums[i]&nums[i]>9) {
                System.out.print(nums[i]);
                System.out.println();
            }
        }
        System.out.println();
    }
} 