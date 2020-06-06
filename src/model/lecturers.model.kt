package model

import common.SALARY_CONSTANT

class Lecturers(
    name: String? = null, coefficientsSalary: Float = 0F,
    var faculty: String? = null, var level: Level? = null, var teachingTime: Int? = 0
) :
    Employee(
        name,
        coefficientsSalary
    ) {
    override fun calculatorSalary(): Long {
        return coefficientsSalary?.toLong()!! * SALARY_CONSTANT + level?.allowance!! + teachingTime!! * 45
    }

    override fun input() {
        super.input()
        println("Enter level(1.BACHELOR,2.MASTER,3.DOCTOR)")
        var choose: Int = readLine()!!.toInt()
        when (choose) {
            1 -> level = Level.BACHELOR
            2 -> level = Level.MASTER
            3 -> level = Level.DOCTOR
            else -> return
        }
        println("Enter number Of Workdays")
        teachingTime = readLine()?.toInt()
        println("Enter faculty")
        faculty = readLine().toString()
    }

    override fun show() {
        super.show()
        println("faculty : $faculty")
        println("level : ${level?.name}")
        println("teaching time : $teachingTime")
        println("allowance : ${level?.allowance}")
        println("salary : ${calculatorSalary()}")
    }

}

enum class Level(var allowance: Int) {
    BACHELOR(300),
    MASTER(500),
    DOCTOR(1000)
}