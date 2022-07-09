def main(args:Array[String])={
    def normal(hours:Int):Int=hours*250;
    def ot(hours:Int):Int=hours*85;
    def income(x1:Int,x2:Int):Int=normal(x1)+ot(x2);
    def tax(income:Int):Int=(income*12)/100;
    def takehomesalary(x1:Int,x2:Int):Double=income(x1,x2) - tax(income(x1,x2));

    println(normal(40));
    println(income(normal(40),ot(30)));
    println(tax(income(normal(40),ot(30))));
    println(takehomesalary(income(normal(40),ot(30)),tax(income(normal(40),ot(30)))));
    
}