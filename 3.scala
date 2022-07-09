def main(args:Array[String])={
    var a:Int = 2;
    var b:Int = 3;
    var c:Int = 4;
    var d:Int = 5;
    var k = 4.3f;
    var g = 4.0f;
    
    println((b-1)*a+c*(d-1));
    a+=1;
    println(a);
    println(-2*(g-k)+c);
    c+=1;
    println(c);
    a+=1;
    c+=1;
    println(c*a);
}