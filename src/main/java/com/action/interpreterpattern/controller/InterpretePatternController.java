package com.action.interpreterpattern.controller;

import com.action.interpreterpattern.service.ExpressionService;
import com.action.interpreterpattern.service.impl.AndExpressionServiceImpl;
import com.action.interpreterpattern.service.impl.OrExpressionServiceImpl;
import com.action.interpreterpattern.service.impl.TerminalExpressionServiceImpl;

/**
 * @author：ZDY
 * @Date：Created in 2020/11/26
 * @Description:
 */


public class InterpretePatternController {

    //规则：Robert 和 John 是男性
    public static ExpressionService getMaleExpression(){
        ExpressionService robert = new TerminalExpressionServiceImpl("Robert");
        ExpressionService john = new TerminalExpressionServiceImpl("John");
        return new OrExpressionServiceImpl(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static ExpressionService getMarriedWomanExpression(){
        ExpressionService julie = new TerminalExpressionServiceImpl("Julie");
        ExpressionService married = new TerminalExpressionServiceImpl("Married");
        return new AndExpressionServiceImpl(julie, married);
    }

    public static void main(String[] args) {
        ExpressionService isMale = getMaleExpression();
        ExpressionService isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
