<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #eef2f3;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            color: #222;
            margin-top: 20px;
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
            margin-top: 40px;
        }

        form {
            background-color: white;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            width: 400px;
            transition: all 0.3s ease;
        }

        form:hover {
            box-shadow: 0 6px 18px rgba(0, 0, 0, 0.15);
        }

        label {
            font-weight: bold;
            font-size: 16px;
            margin-bottom: 10px;
            display: block;
        }

        input[type="number"] {
            width: calc(100% - 20px);
            padding: 10px;
            margin-top: 5px;
            margin-bottom: 20px;
            border: 2px solid #ccc;
            border-radius: 8px;
            font-size: 16px;
        }

        .button-container {
            text-align: center;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        input[type="reset"] {
            background-color: #f44336;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-size: 16px;
            margin-left: 10px;
            transition: background-color 0.3s ease;
        }

        input[type="reset"]:hover {
            background-color: #e53935;
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
<br>
    <h3 style="text-align: center;"><u>View Employee By ID</u></h3>
    <div class="form-container">
        <form method="post" action="displayemp">
            <label for="eid">Enter Employee ID</label>
            <input type="number" id="eid" name="eid" required/>

            <div class="button-container">
                <input type="submit" value="View" />
                <input type="reset" value="Reset" />
            </div>
        </form>
    </div>
</body>
</html>
