package task5;

public class Function implements Calculate{
    @Override
    public double funcExp(double x)
    {
        return Math.exp(x);
    }
    @Override
    public double funcSin(double x){
        return Math.sin(x);
    }
    @Override
    public double funcCos(double x){
        return Math.cos(x);
    }
}
