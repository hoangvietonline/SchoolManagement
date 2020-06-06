package controler

import model.Administrative
import model.Employee
import model.Lecturers

class ManagerEmployee{
    var employeeList = mutableListOf<Employee>()

    // add administrative to employee list
    fun addAdministrative() {
        val administrative = Administrative()
        administrative.input()
        employeeList.add(administrative)
    }

    // add lecturers to employee list
    fun addLecturers() {
        val lecturers = Lecturers()
        lecturers.input()
        employeeList.add(lecturers)
    }

    //get list Administrative
    fun getAdministrativeList() {
        for (x in employeeList) {
            if (x is Administrative) {
                x.show()
            }
        }
    }

    //get list lecturers
    fun getLecturersList() {
        for (x in employeeList) {
            if (x is Lecturers) {
                x.show()
            }
        }
    }

    //show menu of application employee management
    fun showMenu() {
        println("==MENU==")
        println("1.Add administrative")
        println("2.Add lecturers")
        println("3.Show administrative")
        println("4.Show lecturers")
    }
    fun calculatorSumSalary(){
        var sumSalary : Long = 0
        for (x in employeeList){
            sumSalary += x.calculatorSalary()
        }
        println("sum salary : $sumSalary")
    }
}