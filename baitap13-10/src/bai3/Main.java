package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("xin moi nhap so");
        int number = sc.nextInt();
        String numberOfWord = "";
        if (number < 0 || number > 999) {
            System.out.println("so khong hop le");
        } else if (number == 0) {
            System.out.println("zero");
        }
        int hundreds = number / 100;
        int remainder = number % 100;
        switch (hundreds) {
            case 1:
                numberOfWord += " one hundreds";
                break;
            case 2:
                numberOfWord += " two hundreds";
                break;
            case 3:
                numberOfWord += " three hundreds";
                break;
            case 4:
                numberOfWord += " four hundreds";
                break;
            case 5:
                numberOfWord += " five hundreds";
                break;
            case 6:
                numberOfWord += " six hundreds";
                break;
            case 7:
                numberOfWord += " seven hundreds";
                break;
            case 8:
                numberOfWord += " eight hundreds";
                break;
            case 9:
                numberOfWord += " night hundreds";
                break;
        }
        if (remainder != 0) {
            int tens = remainder / 10;
            int ones = remainder % 10;
            switch (tens) {
                case 1:
                    switch (remainder) {
                        case 11:
                            numberOfWord += "eleven";
                            break;
                        case 12:
                            numberOfWord += "Twelve";
                            break;
                        case 13:
                            numberOfWord += "Thirteen";
                            break;
                        case 14:
                            numberOfWord += "Fourteen";
                            break;
                        case 15:
                            numberOfWord += "Fifteen";
                            break;
                        case 16:
                            numberOfWord += "Sixteen";
                            break;
                        case 17:
                            numberOfWord += "Seventeen";
                            break;
                        case 18:
                            numberOfWord += "Eighteen";
                            break;
                        case 19:
                            numberOfWord += "Nineteen";
                            break;
                    }
                case 2:
                    numberOfWord += "Twenty";
                    break;
                case 3:
                    numberOfWord += "thrity";
                    break;
                case 4:
                    numberOfWord += "fourty";
                    break;
                case 5:
                    numberOfWord += "fifty";
                    break;
                case 6:
                    numberOfWord += "sixty";
                    break;
                case 7:
                    numberOfWord += "seventy";
                    break;
                case 8:
                    numberOfWord += "eighty";
                    break;
                case 9:
                    numberOfWord += "nighty";
                    break;
                default:
            }
            if (tens != 1) {
                switch (ones) {
                    case 1:
                        numberOfWord += "one";
                        break;
                    case 2:
                        numberOfWord += "two";
                        break;
                    case 3:
                        numberOfWord += "three";
                        break;
                    case 4:
                        numberOfWord += "four";
                        break;
                    case 5:
                        numberOfWord += "five";
                        break;
                    case 6:
                        numberOfWord += "six";
                        break;
                    case 7:
                        numberOfWord += "seven";
                        break;
                    case 8:
                        numberOfWord += "eight";
                        break;
                    case 9:
                        numberOfWord += "night";
                        break;
                }
            }
        }
        System.out.println(numberOfWord);
    }

}
