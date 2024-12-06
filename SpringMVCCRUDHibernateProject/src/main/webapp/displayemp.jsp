<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
    <title>Spring MVC</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-top: 20px;
            font-size: 28px;
            font-weight: bold;
        }

         .navbar {
            text-align: center;
            margin-bottom: 20px;
            background-color: #4a3f75; /* Royal purple color */
            padding: 15px 0;
        }

        .navbar a {
            text-decoration: none;
            color: white;
            padding: 12px 25px;
            border-radius: 8px;
            font-weight: bold;
            transition: background-color 0.3s ease;
            background-color: #4a3f75; /* Same color as the button */
        }

        .navbar a:hover {
            background-color: #362b5e; /* Darker purple on hover */
        }

        .content {
            max-width: 600px;
            margin: 0 auto;
            background-color: white;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        .content h3 {
            margin-bottom: 30px;
            color: #333;
            text-decoration: inherit;
            font-size: 24px;
            font-weight: 600;
        }

        .employee-details {
            text-align: left;
            font-size: 18px;
            line-height: 1.8;
            color: #444;
        }

        .employee-details div {
            margin-bottom: 10px;
            display: flex;
            justify-content: space-between;
            font-weight: 500;
            padding: 3px;
        }

        .employee-details b {
            color: #333;
            font-weight: 600;
            flex: 1;
        }

        .employee-details c\\:out {
            margin-left: 10px;
            font-weight: 500;
            flex: 2;
            text-align: right;
        }
        
        .employee-details div:nth-child(even) {
            background-color: #f9f9f9;
            border-radius: 5px;
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

    <div class="content">
        <h3>View Employee By ID</h3>
        <div class="employee-details">
            <div><b>ID:</b> <c:out value="${emp.id}"/></div>
            <div><b>Name:</b> <c:out value="${emp.name}"/></div>
            <div><b>Gender:</b> <c:out value="${emp.gender}"/></div>
            <div><b>Date of Birth:</b> <c:out value="${emp.dateofbirth}"/></div>
            <div><b>Department:</b> <c:out value="${emp.department}"/></div>
            <div><b>Salary:</b> <c:out value="${emp.salary}"/></div>
            <div><b>Location:</b> <c:out value="${emp.location}"/></div>
            <div><b>Email:</b> <c:out value="${emp.email}"/></div>
            <div><b>Contact:</b> <c:out value="${emp.contact}"/></div>
        </div>
    </div>
</body>
</html>
