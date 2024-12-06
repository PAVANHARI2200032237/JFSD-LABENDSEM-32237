<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Employee</title>
    <!-- Include Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
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

        /* Add CSS for delete icon */
/* Add CSS for delete icon */
td a {
    display: inline-block;
    width: 24px; /* Adjust size as needed */
    height: 24px;
    background: url('https://cdn-icons-png.flaticon.com/512/1214/1214428.png') no-repeat center center;
    background-size: contain;
    border: none;
    position: relative;
    transition: opacity 0.3s ease, transform 0.3s ease;
    opacity: 0.7; /* Default opacity */
}

/* On hover */
td a:hover {
    opacity: 1;
    transform: scale(1.1); /* Slight zoom effect */
}

/* Tooltip text */
td a::after {
    content: 'Delete';
    display: block;
    position: absolute;
    left: 50%;
    top: 100%;
    transform: translateX(-50%);
    background-color: rgba(0, 0, 0, 0.7); /* Dark background with transparency */
    color: #fff;
    padding: 5px 10px;
    border-radius: 5px;
    font-size: 12px;
    white-space: nowrap;
    opacity: 0;
    pointer-events: none;
    transition: opacity 0.3s ease;
}

/* Show tooltip on hover */
td a:hover::after {
    opacity: 1;
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
    <h3><u>Delete Employee</u></h3>
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
                <th>Action</th>
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
                    <td>
  				    <a href='<c:url value="delete?id=${emp.id}"></c:url>'></a>
					</td>

                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
