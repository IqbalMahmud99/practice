import java.util.Scanner
fun main (args:Array<String>){
    var sc = Scanner(System.`in`)

    print("Enter starting year")

    var startingyear = sc.nextInt()

    print("enter reding year")

    var endingyear = sc.nextInt()

    println("leap year from $startingyear to $endingyear is :\n")

    for ( year in startingyear..endingyear step 2){

        if (year%4==0 && year%100!=0 || year%400==0){

            println("$year is a leap year")
            

        }
        else{
            println("$year is a not leap year")
        }
    }
}