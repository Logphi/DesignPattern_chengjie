package com.ttl.designpattern.ch27;

/**
 * @ClassName Expression
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 16:22
 * Version 1.0
 **/
public abstract class Expression {

    public void interpret(PlayContext context) {
        if (!(context.getText().length() == 0)) {
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            double playVal = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
            execute(playKey, playVal);
        }
    }

    public abstract void execute(String key, double value);
}
