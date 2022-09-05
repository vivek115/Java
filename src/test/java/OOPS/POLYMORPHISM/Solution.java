package OOPS.POLYMORPHISM;

import java.io.*;
import java.time.LocalDate;

    class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int month = Integer.parseInt(firstMultipleInput[0]);

            int day = Integer.parseInt(firstMultipleInput[1]);

            int year = Integer.parseInt(firstMultipleInput[2]);

            String res = findDay(month, day, year);

            bufferedWriter.write(res);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
        public static String findDay(int month, int day, int year) {
            int d = Integer.valueOf(day);
            int m =Integer.valueOf(month);
            int y = Integer.valueOf(year);
            LocalDate date = LocalDate.of(m,d,y);
            return date.getDayOfWeek().toString();
        }
    }
