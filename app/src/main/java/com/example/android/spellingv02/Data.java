package com.example.android.spellingv02;

public class Data {

    private String[] mQuestion = {"Choose the correct spelling", "Select the word with correct spelling", "Find the correctly spelt word "};
    private String[] mOption1= {"Amatuer", " Benefited", " Servent"};
    private String[] mOption2= {"Amature", "Benefitted", "Sarvent"};
    private String[] mOption3= {"Amateur", "Benifitted", "Servant"};
    private String[] mOption4 = {"Ameteur", "Benifited", "Sarvant"};
    private String[] mAnswer= {"Amateur", "Benefitted", "Servant"};

    public Data(){
    }

    public String[] getQuestion() {
        return mQuestion;
    }

    public String[] getOption1() {
        return mOption1;
    }

    public String[] getOption2() {
        return mOption2;
    }
    public String[] getOption3() {
        return mOption3;
    }
    public String[] getOption4() {
        return mOption4;
    }

    public String[] getAnswer() {
        return mAnswer;
    }

    public void setOption1(String[] option1){
        this.mOption1 = option1;
    }


}
