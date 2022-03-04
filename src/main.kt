fun main (){
    var text = "akirachix"
    println(text[0].toString()+text[2]+text[3])
    var m =sentence("dallen",20)
    println(m)
    var d = word()
    println(d)
    identity("DALLEN")
    identity("SPERIA")
}

fun sentence(name: String , years: Int) :String{
    var f =("Hi, my is $name and i am $years years old")
    return(f)

}
fun word():Int{
    var word ="success"
    var l = word.length
    return l
}

fun identity(name:String){
    if(name=="DALLEN")
        println("thats me")
    else
        println("i dont know who that is")
}



