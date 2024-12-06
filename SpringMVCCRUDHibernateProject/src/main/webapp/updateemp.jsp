<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC</title>
    <style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
    }

    h2, h3 {
        text-align: center;
        color: #333;
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

    .form-container {
        display: flex;
        justify-content: center;
        align-items: center;
        margin-top: 30px;
    }

    form {
        background-color: white;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.2);
        width: 400px;
    }

    table {
        width: 100%;
    }

    td {
        padding: 12px 0;
    }

    label {
        font-weight: bold;
        color: #555;
    }

    input[type="text"], input[type="number"], input[type="email"] {
        width: 100%;
        padding: 10px;
        margin: 5px 0;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
    }

    input[type="submit"], input[type="reset"] {
        margin: 10px 5px;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        color: white;
        cursor: pointer;
        font-size: 16px;
    }

    input[type="submit"] {
        background-color: #4CAF50;
    }

    input[type="reset"] {
        background-color: #f44336;
    }

    input[type="submit"]:hover, input[type="reset"]:hover {
        opacity: 0.9;
    }

    .button-container {
        text-align: center;
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
    <h3 style="text-align: center;"><u>Update Employee</u></h3>
    <div class="form-container">
        <form method="post" action="update">
            <table>
                <tr>
                    <td><label for="eid">Enter Existing ID</label></td>
                    <td><input type="number" id="eid" name="eid" required/></td>
                </tr>
                 <tr>
                    <td><label for="ename">Enter Name</label></td>
                    <td><input type="text" id="ename" name="ename" required/></td>
                </tr>
                <tr> 
                <tr>
                    <td><label for="esalary">Enter Salary</label></td>
                    <td><input type="number" id="esalary" name="esalary" step="0.1" required/></td>
                </tr>
                <tr>
                    <td><label for="eemail">Enter Email ID</label></td>
                    <td><input type="email" id="eemail" name="eemail" required/></td>
                </tr>
                <tr>
                    <td><label for="econtact">Enter Contact</label></td>
                    <td><input type="number" id="econtact" name="econtact" required/></td>
                </tr>
                <tr>
                    <td colspan="2" class="button-container">
                        <input type="submit" value="Update Employee"/>
                        <input type="reset" value="Clear"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
