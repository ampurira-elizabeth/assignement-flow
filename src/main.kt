fun main() {
odd()
    println(Anames(arrayOf("Tomothy","liz","Pascaline","Lyne","Datha")))

   serverobots(4)
   serverobots(7)
    serverobots(16)
    serverobots(20)
    serverobots(12)

   eachnumb()
}
fun odd(){
    for (n in 1..100)
        if(n%2!=0){
            println(n)
        }
}

fun Anames(names:Array<String>):Int {
    var numb=0
     names.forEach { num ->
        if (num.length >5) {
            numb++

        }

    }
    return numb
}
fun serverobots(age:Int){
    if (age<6){
        println("glass of milk")}
     else if(age>=6 && age<15){
         println("A bottle of fanta orange")
        }
        else{
            println("A bottl of coca cola")
        }

}
fun eachnumb(){
    for (n in 1..100)
        if (n%3==0 && n%5==0) {
            println("fizzbuzz")
        }
    else if (n%5==0) {
            println("Buzz")
        }
    else if (n%3==0){
        println("Fizz")
    }
}