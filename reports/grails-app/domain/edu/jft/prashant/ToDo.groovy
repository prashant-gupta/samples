package edu.jft.prashant

class ToDo {
    String title
    String description

    static belongsTo = [employee:Employee]
    static constraints = {
    }
}
