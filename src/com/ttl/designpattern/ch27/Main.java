package com.ttl.designpattern.ch27;

/**
 * @ClassName Main
 * @Description 解释器模式范例
 * @Author ttl
 * @Date 2020/7/2 16:10
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        String text = "O 2 E ";
        context.setText(text);
        Expression expression = null;
        try {
            while (context.getText().length() > 0) {
                String str = context.getText().substring(0, 1);
                switch (str) {
                    case "O":
                        expression = new Scale();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                    case "P":
                        expression = new Note();
                        break;
                }
                expression.interpret(context);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
