package edu.jft.prashant



import org.junit.*
import grails.test.mixin.*

@TestFor(ToDoController)
@Mock(ToDo)
class ToDoControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/toDo/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.toDoInstanceList.size() == 0
        assert model.toDoInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.toDoInstance != null
    }

    void testSave() {
        controller.save()

        assert model.toDoInstance != null
        assert view == '/toDo/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/toDo/show/1'
        assert controller.flash.message != null
        assert ToDo.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/toDo/list'

        populateValidParams(params)
        def toDo = new ToDo(params)

        assert toDo.save() != null

        params.id = toDo.id

        def model = controller.show()

        assert model.toDoInstance == toDo
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/toDo/list'

        populateValidParams(params)
        def toDo = new ToDo(params)

        assert toDo.save() != null

        params.id = toDo.id

        def model = controller.edit()

        assert model.toDoInstance == toDo
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/toDo/list'

        response.reset()

        populateValidParams(params)
        def toDo = new ToDo(params)

        assert toDo.save() != null

        // test invalid parameters in update
        params.id = toDo.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/toDo/edit"
        assert model.toDoInstance != null

        toDo.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/toDo/show/$toDo.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        toDo.clearErrors()

        populateValidParams(params)
        params.id = toDo.id
        params.version = -1
        controller.update()

        assert view == "/toDo/edit"
        assert model.toDoInstance != null
        assert model.toDoInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/toDo/list'

        response.reset()

        populateValidParams(params)
        def toDo = new ToDo(params)

        assert toDo.save() != null
        assert ToDo.count() == 1

        params.id = toDo.id

        controller.delete()

        assert ToDo.count() == 0
        assert ToDo.get(toDo.id) == null
        assert response.redirectedUrl == '/toDo/list'
    }
}
