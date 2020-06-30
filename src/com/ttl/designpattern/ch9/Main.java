package com.ttl.designpattern.ch9;

/**
 * @ClassName Main
 * @Description 原型设计模式范例： clone方法的使用
 * @Author ttl
 * @Date 2020/6/30 13:54
 * Version 1.0
 **/
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume();
        resume.setName("张三");
        resume.setSex("男");
        WorkExperience workExperience = new WorkExperience();
        workExperience.setCompany("啥好说是");
        workExperience.setWorkDate("2009-01-01");
        resume.setExperience(workExperience);

        Resume clone = (Resume) resume.clone();
        clone.getExperience().setCompany("修改修改");

        System.out.println(resume);
        System.out.println("--------------------------------");
        System.out.println(clone);
    }
}
