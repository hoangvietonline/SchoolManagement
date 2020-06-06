package model

abstract class Employee(var name: String?, var coefficientsSalary: Float?) {
    abstract fun calculatorSalary(): Long
    open fun show() {
        println("INFORMATION EMPLOYEE")
        println("name : $name")
        println("coefficientsSalary : $coefficientsSalary")
    }

    open fun input() {
        println("Enter information employee")
        println("Enter name: ")
        name = readLine().toString()
        println("Enter coefficientsSalary")
        coefficientsSalary = readLine()?.toFloat()
    }
}