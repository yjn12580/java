package com.rumen3;

public class graduate extends student {
    public  graduate(String name,double score) {
        this.name=name;
        this.score=score;
    }

    public void ks(){
        System.out.println("考试不及格");
    }
}
