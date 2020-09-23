public class App {
    private CalculatorService cs;
    public void setCs(CalculatorService calculatorService){
        this.cs = calculatorService;
    }

    public int addition(int a ,int b){
        return cs.add(a,b); //this add is from external dependency and it will return the mocked value.
    }
    public int difference(int a ,int b){
        return cs.diff(a,b);
    }
    public int multiply(int a ,int b){
        return cs.mult(a,b);
    }
    public int division(int a ,int b){
        return cs.div(a,b);
    }
    public int remainderActual(int a ,int b){
        return cs.remainder(a,b);
    }
}
