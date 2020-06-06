package main

import controler.ManagerEmployee

fun main() {
    val manager = ManagerEmployee()
    var a = true
    var choose: Int
    while (a) {
        manager.showMenu()
        try {
            choose = readLine()!!.toInt()
            when (choose) {
                1 -> manager.addAdministrative()
                2 -> manager.addLecturers()
                3 -> manager.getAdministrativeList()
                4 -> manager.getLecturersList()
                5 -> manager.calculatorSumSalary()
                else -> a = false
            }
        }catch (e : Exception){
            println("please choose again!")
        }
    }
}