<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
        <h1>List of projects !</h1>
        <table class="table table-bordered table-striped table-hover container-fluid">
            <div><span class="pull-right"> <a href="${project.id}"><button type="button" class="btn btn-info">ADD RECORDS<div class="glyphicon glyphicon-plus"></div></button></a></span></div>
            <tr>
                <td>ID</td>
                <td>Title</td>
                <td>Description</td>
                <td>Started Date</td>
                <td>End Date</td>
                <td>Status</td>
                <td>Action</td>
            </tr>
            
            <c:forEach var="project" items="${requestScope.projects}">
                <tr<c:if test="${project.status}"> class="danger"</c:if>>
                
                <td>${project.id}</td>
                <td>${project.name}</td>
                <td>${project.description}</td>
                <td>${project.startedDate}</td>
                <td>${project.endDate}</td>
                <td>${project.status}</td>
                <td>
                    <a href="${project.id}"><button type="button" class="btn btn-success">Edit<div span class="glyphicon glyphicon-pencil"></div></button></a>
                    <a href="${project.id}"><button type="button" class="btn btn-danger">Delete<div class="glyphicon glyphicon-trash"></div></button></a>
                    </td>
                
            </tr>
            
            </c:forEach>
        </table>
        <%@include file="footer.jsp" %>
