package edu.jft.prashant

import org.codehaus.groovy.grails.plugins.jasper.JasperReportDef
import org.springframework.dao.DataIntegrityViolationException

class EmployeeController {

    def jasperService

    static scaffold = true

    def report = {
        Employee employee = Employee.findById(params.long('employeeId'))

        Map result = [:]
        result.data = []
        result.data << [title:employee.empNumber,name:employee.lastName]
        JasperReportDef rep = jasperService.buildReportDefinition(params,request.locale,result)
        ByteArrayOutputStream stream = jasperService.generateReport(rep)
        response.setHeader("Content-disposition", "attachment; filename=" + 'fileName' + ".pdf")
        response.contentType = "application/pdf"
        response.outputStream << stream.toByteArray()
    }
}
