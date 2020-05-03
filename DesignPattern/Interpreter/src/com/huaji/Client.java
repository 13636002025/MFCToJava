package com.huaji;

public class Client {
    public static void main(String[] args) {
        Expression isMale=getMaleExpression();
        Expression isMairriedWoman=getMarriedWomanExpression();

        System.out.println("John is male" + isMale.interpret("John"));
        System.out.println("Julie is a married women?"+isMairriedWoman.interpret("Married Julie"));
    }
    //robert和john是男性
    public static Expression getMaleExpression(){
        Expression robert=new TerminalExpression("Robert");
        Expression john=new TerminalExpression("John");
        return new OrExpression(robert,john);
    }
    //Julie是已婚女性
    public static Expression getMarriedWomanExpression(){
        Expression julie=new TerminalExpression("Julie");
        Expression married=new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }
}
