package model

import common.SALARY_CONSTANT

class Administrative(
    name: String? = null, coefficientsSalary: Float = 0.0F,
    var position: Position? = null, var numberOfWorkdays: Int? = 0, var department: String? = null
) :
    Employee(
        name,
        coefficientsSalary
    ) {


    override fun calculatorSalary(): Long {
        return coefficientsSalary?.toLong()!! * SALARY_CONSTANT + position?.allowance!! + numberOfWorkdays!! * 200
    }

    override fun show() {
        super.show()
        println("position : ${position?.name}")
        println("Department : $department")
        println("numberOfWorkdays : $numberOfWorkdays")
        println("allowance : ${position?.allowance}")
        println("salary : ${calculatorSalary()}")
    }

    override fun input() {
        super.input()
        println("Enter Position(1.MANAGER,2.DEPUTY,3.EMPLOYEE)")
        var choose: Int = readLine()!!.toInt()
        when (choose) {
            1 -> position = Position.MANAGER
            2 -> position = Position.DEPUTY
            3 -> position = Position.EMPLOYEE
            else -> return
        }
        println("Enter number Of Workdays")
        numberOfWorkdays = readLine()?.toInt()
        println("Enter department")
        department = readLine().toString()
    }
}

enum class Position(var allowance: Int) {
    MANAGER(2000),
    DEPUTY(1000),
    EMPLOYEE(500)
}