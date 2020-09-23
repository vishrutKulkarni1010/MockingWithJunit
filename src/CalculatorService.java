public interface CalculatorService {
    public int add(int a ,int b);
    public int diff(int a,int b);
    public int mult(int a,int b);
    public int div(int a,int b);
    public int remainder(int a,int b);
}
//treat this interface as external dependencies and we are using
//when then to stub the response from these dependencies.