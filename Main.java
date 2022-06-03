package My_tasks;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static int oneNumber;
    static int twoNumber;

    static Integer resultArab;
    static String  resultRim;
    static String  resultArabString;

    static String rimNumber_1 = "I";
    static String rimNumber_2 = "II";
    static String rimNumber_3 = "III";
    static String rimNumber_4 = "IV";
    static String rimNumber_5 = "V";
    static String rimNumber_6 = "VI";
    static String rimNumber_7 = "VII";
    static String rimNumber_8 = "VIII";
    static String rimNumber_9 = "IX";
    static String rimNumber_10 = "X";
    static String rimNumber_50 = "L";
    static String rimNumber_100 = "C";



    static String[] arrayStringSplitResult;




    public static String returnRimAt_1_to_9() {

        String at_1_to_9 = "";
        int i = 0;

        //Если нужно вернуть вторую цыфру в результате
        if(arrayStringSplitResult.length==2){i=1;}


        if (arrayStringSplitResult[i].equals("1")) {at_1_to_9 = rimNumber_1;}
        if (arrayStringSplitResult[i].equals("2")) {at_1_to_9 = rimNumber_2;}
        if (arrayStringSplitResult[i].equals("3")) {at_1_to_9 = rimNumber_3;}
        if (arrayStringSplitResult[i].equals("4")) {at_1_to_9 = rimNumber_4;}
        if (arrayStringSplitResult[i].equals("5")) {at_1_to_9 = rimNumber_5;}
        if (arrayStringSplitResult[i].equals("6")) {at_1_to_9 = rimNumber_6;}
        if (arrayStringSplitResult[i].equals("7")) {at_1_to_9 = rimNumber_7;}
        if (arrayStringSplitResult[i].equals("8")) {at_1_to_9 = rimNumber_8;}
        if (arrayStringSplitResult[i].equals("9")) {at_1_to_9 = rimNumber_9;}

        return at_1_to_9;
    }

    static String returnRim_10or20or30or40or50or60or70or80or90or100(){
        String desyatky = "";
        if (resultArab >= 10 && resultArab < 20) {desyatky = rimNumber_10;}
        if (resultArab >= 20 && resultArab < 30) {desyatky = rimNumber_10+rimNumber_10;}
        if (resultArab >= 30 && resultArab < 40) {desyatky = rimNumber_10+rimNumber_10+rimNumber_10;}
        if (resultArab >= 40 && resultArab < 50) {desyatky = rimNumber_10+rimNumber_50;}
        if (resultArab >= 50 && resultArab < 60) {desyatky = rimNumber_50;}
        if (resultArab >= 60 && resultArab < 70) {desyatky = rimNumber_50+rimNumber_10;}
        if (resultArab >= 70 && resultArab < 80) {desyatky = rimNumber_50+rimNumber_10+rimNumber_10;}
        if (resultArab >= 80 && resultArab < 90) {desyatky = rimNumber_50+rimNumber_10+rimNumber_10+rimNumber_10;}
        if (resultArab >= 90 && resultArab < 100) {desyatky = rimNumber_10+rimNumber_100;}

        return desyatky;
    }




    public static String calc(String input) throws IOException {


        System.out.println("\nВведите пример арабскими целыми числами или римскими от 1 до 10 со следующими" +
                " арифметическими выражениями: \"+, -, /,*\"");

        Scanner scanner = new Scanner(System.in);
        String textInput = scanner.nextLine();



        if (!textInput.matches("(\\d{1,2}|[XVI]+).(\\d{1,2}|[XVI]+)")){
            System.out.println("Введено неподходящее значение чисел");
            throw new IOException();
        }

        if (!textInput.matches(".+(\\+|-|/|\\*).+")){
            System.out.println("Можно использовать только следующие операции: \"+, -, /,*\"");
            throw new IOException();
        }



        String [] arrayNum1and2 = textInput.split("\\+|-|/|\\*");



        if (arrayNum1and2[0].matches("[XVI]+") && arrayNum1and2[1].matches("\\d+")){
            System.out.println("Можно использовать только Арабские или только Римские цыфры");
            throw new IOException();
        }
        if (arrayNum1and2[0].matches("\\d+") && arrayNum1and2[1].matches("[XVI]+")){
            System.out.println("Можно использовать только Арабские или только Римские цыфры");
            throw new IOException();
        }



        Pattern patternPlus = Pattern.compile("(\\d{1,2}|[XVI]+)\\+(\\d{1,2}|[XVI]+)");
        Matcher matcherPlus = patternPlus.matcher(textInput);

        Pattern patternMinus = Pattern.compile("(\\d{1,2}|[XVI]+)-(\\d{1,2}|[XVI]+)");
        Matcher matcherMinus = patternMinus.matcher(textInput);

        Pattern patternMultiply = Pattern.compile("(\\d{1,2}|[XVI]+)\\*(\\d{1,2}|[XVI]+)");
        Matcher matcherMultiply = patternMultiply.matcher(textInput);

        Pattern patternDivide = Pattern.compile("(\\d{1,2}|[XVI]+)/(\\d{1,2}|[XVI]+)");
        Matcher matcherDivide = patternDivide.matcher(textInput);




        if(arrayNum1and2[0].matches("\\d{1,2}") && arrayNum1and2[1].matches("\\d{1,2}")){
            oneNumber = Integer.parseInt(arrayNum1and2[0]);
            twoNumber = Integer.parseInt(arrayNum1and2[1]);
        }



        if (arrayNum1and2[0].matches("[XVI]+") && arrayNum1and2[1].matches("[XVI]+")) {

            if (arrayNum1and2[0].equals("I")) {oneNumber = 1;}
            if (arrayNum1and2[0].equals("II")) {oneNumber = 2;}
            if (arrayNum1and2[0].equals("III")) {oneNumber = 3;}
            if (arrayNum1and2[0].equals("IV")) {oneNumber = 4;}
            if (arrayNum1and2[0].equals("V")) {oneNumber = 5;}
            if (arrayNum1and2[0].equals("VI")) {oneNumber = 6;}
            if (arrayNum1and2[0].equals("VII")) {oneNumber = 7;}
            if (arrayNum1and2[0].equals("VIII")) {oneNumber = 8;}
            if (arrayNum1and2[0].equals("IX")) {oneNumber = 9;}
            if (arrayNum1and2[0].equals("X")) {oneNumber = 10;}

            if (arrayNum1and2[1].equals("I")) {twoNumber = 1;}
            if (arrayNum1and2[1].equals("II")) {twoNumber = 2;}
            if (arrayNum1and2[1].equals("III")) {twoNumber = 3;}
            if (arrayNum1and2[1].equals("IV")) {twoNumber = 4;}
            if (arrayNum1and2[1].equals("V")) {twoNumber = 5;}
            if (arrayNum1and2[1].equals("VI")) {twoNumber = 6;}
            if (arrayNum1and2[1].equals("VII")) {twoNumber = 7;}
            if (arrayNum1and2[1].equals("VIII")) {twoNumber = 8;}
            if (arrayNum1and2[1].equals("IX")) {twoNumber = 9;}
            if (arrayNum1and2[1].equals("X")) {twoNumber = 10;}
        }




        if (oneNumber <= 10 && oneNumber > 0 && twoNumber <= 10 && twoNumber > 0) {

            if (matcherPlus.find()) {resultArab = oneNumber + twoNumber;}

            if (matcherMinus.find()) {resultArab = oneNumber - twoNumber;}

            if (matcherMultiply.find()) {resultArab = oneNumber * twoNumber;}

            if (matcherDivide.find()) {resultArab = oneNumber / twoNumber;}
        }
        else {
            System.out.println("Можно использовать арабские и римские числа только от 1 до 10 ");
            throw new IOException();
        }



        if (resultArab < 1 && arrayNum1and2[0].matches("[XVI]+") && arrayNum1and2[1].matches("[XVI]+")) {
            System.out.println("Результатом работы с римскими числами могут быть только положительные числа");
            throw new IOException();
        }



        resultArabString = resultArab.toString();
        arrayStringSplitResult = resultArabString.split("");



        if (arrayStringSplitResult.length == 1) {
            resultRim = returnRimAt_1_to_9();
        }

        if(resultArabString.length() == 2){
            resultRim = returnRim_10or20or30or40or50or60or70or80or90or100() + returnRimAt_1_to_9();
        }

        if(resultArabString.length() == 3){
            resultRim = rimNumber_100;
        }




        if(arrayNum1and2[0].matches("\\d{1,2}") && arrayNum1and2[1].matches("\\d{1,2}")) {
            System.out.println("Результат: " + resultArab);
            return resultArab.toString();
        }
        else{
            System.out.println("Результат: " + resultRim);
            return resultRim;
        }
    }



    public static void main(String[] args) throws IOException {

        while (true){
            calc("");
        }
    }
}

