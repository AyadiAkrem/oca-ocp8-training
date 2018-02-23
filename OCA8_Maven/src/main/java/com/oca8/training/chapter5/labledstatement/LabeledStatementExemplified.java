package com.oca8.training.chapter5.labledstatement;

public class LabeledStatementExemplified {


    public static void main(String[] str) {
        outer:
        {
            System.out.println("Begin");
            if (true)
                break outer;
            System.out.println("After the break");
        }

        labledSwitch:
        switch (str.length) {
            case 1:
            case 2:
                break labledSwitch;
        }

    }

    public static int examplifiedLabeledStatements() throws IllegalAccessException {
        int x;
        labeledAssignement:
        x = 34;
        labeledIf:
        if (x > 56) {
            labeledThrows:
            throw new IllegalAccessException();


        }
        labeledReturn:
        return 1;
    }
}
