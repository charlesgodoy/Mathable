package charlesgodoy.mathable.model;

public class MathModel {

    private int varX;
    private String operator;
    private int varY;

    public MathModel() {
    }

    public MathModel(int varX, String operator, int varY) {
        this.varX = varX;
        this.operator = operator;
        this.varY = varY;
    }

    public int getVarX() {
        return varX;
    }

    public void setVarX(int varX) {
        this.varX = varX;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getVarY() {
        return varY;
    }

    public void setVarY(int varY) {
        this.varY = varY;
    }
}