fun main (){

    val word ="codehive"
    val f = word[4].toString()+word[5]+word[6]+word[7]
    println(f)
    var r =modulus(20,3)
    println(r)
    var u =sentence("dallen",20)
    println(u)
    var x =word()
    println(x)
}
fun modulus(e:Int , t:Int):Int{
    var mod =e%t
    return mod
}
fun sentence(name:String , years:Int): String{
    var y =("Hi my name is $name and i am $years years old")
   return y
}

fun word():Int{
    val d="success"
    val g =d.length
    return g
}
