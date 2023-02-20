package Passjir
open class Passajir(var Station:String, var  Time:String, var Date:String) {
    var amrt: Boolean = true
    open fun input() {
        try {
                print("Введите остановку на которой вы находитесь: ")
                Station = readLine()!!.toString()
                print("Введите время: ")
                Time = readLine()!!.toString()
                print("Введите дату: ")
                Date = readLine()!!.toString()
             }
        catch (e: Exception) {
            println("Неверный ввод")
        }
    }
        open fun show() {
            println("Ваша остановка: $Station\nВаша время: $Time\nВаша дата: $Date")
        }
    }


