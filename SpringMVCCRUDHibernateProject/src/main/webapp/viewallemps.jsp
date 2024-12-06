<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View All Employees</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f5f7fa;
            margin: 0;
            padding: 0;
        }

        h2, h3 {
            text-align: center;
            color: #333;
            margin-top: 20px;
        }

        .navbar {
            text-align: center;
            margin-bottom: 30px;
            background-color: #4a3f75;
            padding: 15px 0;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        .navbar a {
            text-decoration: none;
            color: white;
            padding: 12px 25px;
            border-radius: 5px;
            font-weight: bold;
            transition: background-color 0.3s ease;
        }

        .navbar a:hover {
            background-color: #362b5e;
        }

        table {
            width: 90%;
            max-width: 1200px;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            overflow: hidden;
        }

        th, td {
            padding: 15px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #4a3f75;
            color: #fff;
            text-transform: uppercase;
            font-weight: 600;
            letter-spacing: 0.05em;
        }

        td {
            font-size: 14px;
            color: #555;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #eaeaea;
            cursor: pointer;
        }

        /* Responsive table */
        @media (max-width: 768px) {
            table, thead, tbody, th, td, tr {
                display: block;
                width: 100%;
            }

            tr {
                margin-bottom: 10px;
            }

            td {
                text-align: right;
                padding-left: 50%;
                position: relative;
            }

            td::before {
                content: attr(data-label);
                position: absolute;
                left: 15px;
                width: 45%;
                padding-right: 10px;
                font-weight: bold;
                text-align: left;
            }

            th {
                display: none;
            }
        }
    </style>
</head>
<body>
    <h2>Spring MVC CRUD Operations with ORM/Hibernate</h2>
    <div class="navbar">
        <a href="home">Home</a>
        <a href="addemp">Add Employee</a>
        <a href="viewallemps">View All Employees</a>
        <a href="updateemp">Update Employee</a>
        <a href="deleteemp">Delete Employee</a>
        <a href="viewempbyid">View Employee By ID</a>
    </div>
    <h3><u>View All Employees</u></h3>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>GENDER</th>
                <th>DATE OF BIRTH</th>
                <th>DEPARTMENT</th>
                <th>SALARY</th>
                <th>LOCATION</th>
                <th>EMAIL</th>
                <th>CONTACT</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${emplist}" var="emp">
                <tr>
                    <td data-label="ID"><c:out value="${emp.id}"/></td>
                    <td data-label="NAME"><c:out value="${emp.name}"/></td>
                    <td data-label="GENDER"><c:out value="${emp.gender}"/></td>
                    <td data-label="DATE OF BIRTH"><c:out value="${emp.dateofbirth}"/></td>
                    <td data-label="DEPARTMENT"><c:out value="${emp.department}"/></td>
                    <td data-label="SALARY"><c:out value="${emp.salary}"/></td>
                    <td data-label="LOCATION"><c:out value="${emp.location}"/></td>
                    <td data-label="EMAIL"><c:out value="${emp.email}"/></td>
                    <td data-label="CONTACT"><c:out value="${emp.contact}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
