package ControlStatements;

public class PR02 {
    public static void main(String[] args) {
        float tax=0;
        float income = 3.3f;
        if(tax<2.5f){
tax = tax+0;
        }
        if(tax>2.5f && tax<5f){
            tax = tax + 0.05f * ( income- 2.5f);
        }
    }
}
