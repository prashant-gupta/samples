import edu.jft.prashant.Employee
import edu.jft.prashant.ToDo

class BootStrap {

    def init = { servletContext ->
        Employee emp = new Employee(lastName: 'lastname',firstName: 'name', empNumber: '1234567890').save()

        10.times {
            ToDo todo = new ToDo(description: 'random todo '+it, title: '#'+it)
            emp.addToTodos(todo)
        }
        emp.save()
    }
    def destroy = {
    }
}
