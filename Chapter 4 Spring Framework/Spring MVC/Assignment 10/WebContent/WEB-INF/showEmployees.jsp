<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"  %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    

  <html>
  <body>
           <table border="3">
               <th>Employee EmployeeID</th>
               <th>Employee EmployeeName</th>
               <th>Employee EmployeeSalary</th>

              <c:forEach items="${list}" var="emp">
                  <tr>

                     <td><c:out value="${emp.empId}" /></td>
                     <td><c:out value="${emp.empName}" /></td>
                     <td><c:out value="${emp.empSalary}" /></td>



                  </tr>
                  </c:forEach>
           </table>


        



  </body>
  </html>