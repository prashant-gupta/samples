<%@ page import="edu.jft.prashant.Employee" %>



<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'empNumber', 'error')} ">
    <label for="empNumber">
        <g:message code="employee.empNumber.label" default="Emp Number"/>

    </label>
    <g:textField name="empNumber" value="${employeeInstance?.empNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'firstName', 'error')} ">
    <label for="firstName">
        <g:message code="employee.firstName.label" default="First Name"/>

    </label>
    <g:textField name="firstName" value="${employeeInstance?.firstName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'lastName', 'error')} ">
    <label for="lastName">
        <g:message code="employee.lastName.label" default="Last Name"/>

    </label>
    <g:textField name="lastName" value="${employeeInstance?.lastName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'todos', 'error')} ">
    <label for="todos">
        <g:message code="employee.todos.label" default="Todos"/>

    </label>

    <ul class="one-to-many">
        <g:each in="${employeeInstance?.todos ?}" var="t">
            <li><g:link controller="toDo" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></li>
        </g:each>
        <li class="add">
            <g:link controller="toDo" action="create"
                    params="['employee.id': employeeInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'toDo.label', default: 'ToDo')])}</g:link>
        </li>
    </ul>

</div>

