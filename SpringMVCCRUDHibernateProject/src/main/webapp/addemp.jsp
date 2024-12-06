<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC</title>
    <style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f5;
        margin: 0;
    }

    h2 {
        text-align: center;
        color: #333;
    }

    .navbar {
        text-align: center;
        margin-bottom: 20px;
        background-color: #4a3f75;
        padding: 15px 0;
    }

    .navbar a {
        text-decoration: none;
        color: white;
        padding: 12px 25px;
        border-radius: 8px;
        font-weight: bold;
        transition: background-color 0.3s ease;
    }

    .navbar a:hover {
        background-color: #362b5e;
    }

    .form-container {
        display: flex;
        justify-content: center;
        align-items: center;
        margin-top: 30px;
    }

    form {
        background-color: #fff;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        padding: 30px;
        width: 40%;
    }

    table {
        width: 100%;
    }

    td {
        padding: 15px;
    }

    label {
        font-weight: bold;
        font-size: 14px;
        color: #333;
    }

    input[type="text"], 
    input[type="number"], 
    input[type="email"], 
    input[type="date"], 
    select {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
        font-size: 14px;
    }

    input[type="radio"] {
        margin-right: 10px;
    }

    input[type="submit"], 
    input[type="reset"] {
        margin: 10px;
        padding: 12px 25px;
        border: none;
        border-radius: 5px;
        color: white;
        cursor: pointer;
        font-size: 14px;
        font-weight: bold;
    }

    input[type="submit"] {
        background-color: #4CAF50;
        transition: background-color 0.3s ease;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }

    input[type="reset"] {
        background-color: #f44336;
        transition: background-color 0.3s ease;
    }

    input[type="reset"]:hover {
        background-color: #d73832;
    }

    .button-container {
        text-align: center;
        padding-top: 20px;
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

    <h3 style="text-align: center;"><u>Add Employee</u></h3>
    <div class="form-container">
        <form method="post" action="insertemp">
            <table>
                <tr>
                    <td><label for="eid">Enter ID</label></td>
                    <td><input type="number" id="eid" name="eid" required/></td>
                </tr>
                <tr>
                    <td><label for="ename">Enter Name</label></td>
                    <td><input type="text" id="ename" name="ename" required/></td>
                </tr>
                <tr>
                    <td><label>Select Gender</label></td>
                    <td>
                        <input type="radio" id="male" name="egender" value="MALE" required/>
                        <label for="male">Male</label>
                        <input type="radio" id="female" name="egender" value="FEMALE" required/>
                        <label for="female">Female</label>
                        <input type="radio" id="others" name="egender" value="OTHERS" required/>
                        <label for="others">Others</label>
                    </td>
                </tr>
                <tr>
                    <td><label for="edob">Enter Date of Birth</label></td>
                    <td><input type="date" id="edob" name="edob" required/></td>
                </tr>
                <tr>
                    <td><label for="edept">Select Department</label></td>
                    <td>
                        <select id="edept" name="edept" required>
                            <option value="">---Select---</option>
                            <option value="TECHNICAL">Technical</option>
                            <option value="MARKETING">Marketing</option>
                            <option value="SALES">Sales</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><label for="esalary">Enter Salary</label></td>
                    <td><input type="number" id="esalary" name="esalary" step="0.1" required/></td>
                </tr>
                <tr>
                    <td><label for="elocation">Enter Location</label></td>
                    <td><input type="text" id="elocation" name="elocation" required/></td>
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
                        <input type="submit" value="Add Employee"/>
                        <input type="reset" value="Clear"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
