package com.ttl.designpattern.ch17;

import java.util.ArrayList;
import java.util.List;
/**
 * @ClassName Main
 * @Description 适配器模式范例
 * @Author ttl
 * @Date 2020/7/1 15:58
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        Player b = new Forwards("巴蒂尔");
        Player m = new Guards("麦迪");
        ChineseCenter y = new ChineseCenter("姚明");
        Translator translator = new Translator();
        translator.setChineseGuards(y);

        players.add(b);
        players.add(m);
        players.add(translator);

        // 开打
        for (Player player : players) {
            player.attack();
            player.defence();
        }
    }
}
