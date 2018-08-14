package ru.raifeisen;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int counter = 1, counter1 = 15, x = 2, x1=(x-1);  //x - делимое, x1 - делитель, x2 - остаток;x1=(x-1)


        do { do
            { int x2=x%x1;
            if (x1==1&x2!=0){
                System.out.print(x+",");
                x++;
                counter++;
                x1=(x-1);
            }
            else if (x2==0) {
                //System.out.println("Нулевой остаток, увеличиваем Х");
                x++;
                x1=(x-1);
                }
            else {
                //System.out.println("Остаток ="+ x2);
                x1--;
                x2=x%x1;}
        } while (x1>1);
            System.out.print(x+",");
            x++;
            counter++;
            x1=(x-1);
        }
        while (counter<counter1);
        System.out.println("на счетчике 15 простых чисел");
    }

    }

