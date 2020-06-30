package com.ttl.designpattern.ch9;

/**
 * @ClassName Resume
 * @Description TODO
 * @Author ttl
 * @Date 2020/6/30 13:53
 * Version 1.0
 **/
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private WorkExperience experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public WorkExperience getExperience() {
        return experience;
    }

    public void setExperience(WorkExperience experience) {
        this.experience = experience;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Resume resume = new Resume();
        resume.name = this.name;
        resume.sex = this.sex;
        resume.experience = (WorkExperience) this.experience.clone();

        return resume;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", experience=" + experience +
                '}';
    }
}
