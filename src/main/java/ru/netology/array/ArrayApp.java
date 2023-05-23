package ru.netology.array;

public class ArrayApp {

    public static void main(String[] args) {
        String apple = "Яблоко";
        String pear = "Груша";
        String pineapple = "Ананас";

        String[] fruits = {apple,pear,pineapple};
        //System.out.println(fruits[1]);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println(fruits[i]);
//        }

//        fruits = new String[3];
//        fruits[0] = apple;
//        fruits[1] = pear;
//        fruits[3] = pineapple;


        String abc = "fdgfdhgfhffffgdfkjdljhkghjlfjhklfjghl" +
                "khjlfkgjhlkfjhlfkgjhflhkjflkhjlkgfjhlgfkjhlkfjhlkfjhljgf" +
                "lhkjfglkjhljfglkjhgflkhjlgfkhjlkfjghlkfjhlkgfhjlkfgjhkjgfhkljfglkhjlfgkhjjlk";

        String text = "text1" + "text2";
    }
}
