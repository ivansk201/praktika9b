import Passjir.Passajir

fun main()
{
    val ott1 = Passajir("ВИЗ","12:34","25.03.2019")
    var ott2 = Train(1,"Октябрьская",2500.0, "ВИЗ", "23:43", "23.05.2019")

    if(ott2.amrt ==true)
    {
        ott2.input()

    }
    println("------------------------------------------------------------------------------------------")
    ott2.show()
    println("------------------------------------------------------------------------------------------")
    ott2.pokupka()


}
