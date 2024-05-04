class VeryAdvCalc extends AdvCalc    //multilevel inheritance
{ //AdvCalc inherits the prperties og Calc and VeryAdvCalc inherites the properties of AdvCalc
    public double power(int n1, int n2)
    {
        return Math.pow(n1, n2);            //we have multiple hierarchy
    }
}
