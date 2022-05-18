package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;


public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        PoemDecorator taskToDo1 = () -> {
            String text1 = "This is the first decorated text.";
            System.out.println(text1.toUpperCase());
        };

        PoemDecorator taskToDo2 = () -> {
            String text2 = "This is the second decorated text.";
            System.out.println("ABC" + " " + text2 + " " + "XYZ");
        };

        PoemDecorator taskToDo3 = () -> {
            String text3 = "This is the third decorated text.";
            System.out.println(text3.replace('t', 'w'));
        };

        PoemDecorator taskToDo4 = () -> {
            String text4 = "This is the fourth decorated text.";
            System.out.println(text4.replace(" ", ""));
        };

        PoemDecorator taskToDo5 = () -> {
            String text5 = "This is the fifth decorated text.";
            for(int i=0; i < text5.length(); i++){
                System.out.println(text5.charAt(i) + " ");

            }

        };

        poemBeautifier.beautify(taskToDo1);
        poemBeautifier.beautify(taskToDo2);
        poemBeautifier.beautify(taskToDo3);
        poemBeautifier.beautify(taskToDo4);
        poemBeautifier.beautify(taskToDo5);
    }
}

