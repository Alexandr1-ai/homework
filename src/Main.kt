fun main()
{
    print("Введите число: ")
    val number = readLine()!!.toInt()

    for(i in 1..10)
    {
        print("$number * $i = ${number * i}\n")
    }
}