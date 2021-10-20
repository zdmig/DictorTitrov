package ru.dictortitrov;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.out;

public class FindVacancy {
    public void start () throws IOException {
        Scanner keyboard = new Scanner(System.in);
        Scanner diskScanner = new Scanner(new File("GuestList.txt"));
        int guests[] = new int[10];
        int roomNum;

        for (roomNum = 0; roomNum < 10; roomNum++){
            guests[roomNum]=diskScanner.nextInt();
        }

        roomNum=0;
        while (roomNum < 10 && guests [roomNum] !=0) {
            roomNum++;
        }

        if (roomNum == 10) {
            out.println("Извините, свободных " + "комнат нет.");
        }
        else {
            out.println("Сколько человек "+"поселятся в комнате ");
            out.print(roomNum);
            out.print("? ");
            guests[roomNum]=keyboard.nextInt();

            PrintStream listOut = new PrintStream("GuestList.txt");

            for (roomNum = 0; roomNum < 10; roomNum++) {
                listOut.print(guests[roomNum]);
                listOut.print(" ");
            }
        }

    }
}
