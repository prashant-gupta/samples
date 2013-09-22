package edu.jft.prashant

class Employee {
    String empNumber
    String firstName
    String lastName

    static hasMany = [todos:ToDo]
    static constraints = {
    }
}
