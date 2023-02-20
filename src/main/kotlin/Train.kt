import Passjir.*


import kotlin.random.Random
class Train(var vibor : Int, var nameost : String, var denigi:Double, empStation : String,var empTime : String,var empDate : String):Passajir(empStation,empTime,empDate) {

    override fun input() {
        super.input()
        print("Введите название нужной вам остановки: ")
        nameost = readLine()!!.toString()
        print("Введите сколько у вас денег: ")
        denigi = readLine()!!.toDouble()
    }


    override fun show() {
        super.show()
        println("Название нужной вам остановки: $nameost")
        println("Денег у вас с собой: $denigi")
    }

    fun pokupka() {
        val cats11 = arrayOf("Пионерная", "Сортировочная", "Екатеринбургер", "Белогорная", "Черная")
        val cats22 = arrayOf("Семь Ключей", "Ярославская", "Синие камни", "Мусоргского", "Селькоровская")
        val cats33 =
            arrayOf("Васильковая", "Бухара-Урал", "Садовый", "Зеленый Остров", "Западная Фильтровальная станция")
        val cats44 = arrayOf("Предельная", "Малый Конный", "Сиреневый бульвар", "Ледовый Дворец", "Умельцев")
        val cats55 = arrayOf("ЖБИ", "Реактивная", "Дом культуры", "Центральная гостиница", "Лесное кладбище")
        val rnds11 = (cats11).random()
        val rnds22 = (cats22).random()
        val rnds33 = (cats33).random()
        val rnds44 = (cats44).random()
        val rnds55 = (cats55).random()
        val rnds1 = (1..60).random()
        val rnds2 = (1..60).random()
        val rnds3 = (1..60).random()
        val rnds4 = (1..60).random()
        val rnds5 = (1..60).random()
        val bil1 = (500..2500).random()!!.toDouble()
        val bil2 = (500..3000).random()!!.toDouble()
        val bil3 = (500..3000).random()!!.toDouble()
        val bil4 = (500..1000).random()!!.toDouble()
        val bil5 = (500..3000).random()!!.toDouble()

        println("Доступные остановки вам до остановки ${nameost} - 1)$rnds11, 2)$rnds22, 3)$rnds33, 4)$rnds44, 5)$rnds55.")
        println("Время от остановки $rnds11 до остановки ${nameost}: $rnds1 мин. Билет стоит $bil1 р.")
        println("Время от остановки $rnds22 до остановки ${nameost}: $rnds2 мин. Билет стоит $bil2 р.")
        println("Время от остановки $rnds33 до остановки ${nameost}: $rnds3 мин. Билет стоит $bil3 р.")
        println("Время от остановки $rnds44 до остановки ${nameost}: $rnds4 мин. Билет стоит $bil4 р.")
        println("Время от остановки $rnds55 до остановки ${nameost}: $rnds5 мин. Билет стоит $bil5 р.")
        println("------------------------------------------------------------------------------------------")
        print("Выберите остановку на которую хотите взять билет до остановки $nameost: ")
        vibor = readLine()!!.toInt()
        when (vibor) {
            1 -> if (denigi>bil1)
            {
                println("Вы выбрали остнановку $rnds11.")
                println("У вас осталось ${denigi-bil1} денег")
            }
            else {
                println("Вам не хватает денег")
            }
            2 -> if (denigi>bil2)
            {
                println("Вы выбрали остнановку $rnds22.")
                println("У вас осталось ${denigi-bil2} денег")
            }
            else {
                println("Вам не хватает денег")
            }
            3 -> if (denigi>bil3)
            {
                println("Вы выбрали остнановку $rnds33.")
                println("У вас осталось ${denigi-bil3} денег")
            }
            else {
                println("Вам не хватает денег")
            }
            4 -> if (denigi>bil4)
            {
                println("Вы выбрали остнановку $rnds44.")
                println("У вас осталось ${denigi-bil4} денег")
            }
            else {
                println("Вам не хватает денег")
            }
            5 -> if (denigi>bil5)
            {
                println("Вы выбрали остнановку $rnds55.")
                println("У вас осталось ${denigi-bil5} денег")
            }
            else {
                println("Вам не хватает денег")
            }
            else -> {
                print("Ошибка. Вы выбрали недопустимую остановку.")
            }
        }




    }
}




