<%-- 
    Document   : NewRegistration
    Created on : 14 Mar, 2018, 10:43:10 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        
        <h1>New Registration</h1>
        
        
        <div id="registration">
                                                  
                        <form action="http://localhost:8080/ProjectTracker/Reg">
                            <table border="3">
                                <tbody>
                                    <tr>
                                        <td>Enrollment No.</td>
                                        <td><input type="text" name="rollno" value="" required placeholder="RGPV Enrollment" /></td>
                                    </tr>
                                    <tr>
                                        <td>Student First Name</td>
                                        <td><input  type="text" name="fname" value="" required placeholder="First Name"/></td>
                                    </tr>
                                     <tr>
                                        <td>Student Last Name</td>
                                        <td><input  type="text" name="lname" value="" required placeholder="Last Name"/></td>
                                    </tr>
                        
                                    <tr>
                                        <td>Semester </td>
                                        <td><input  type="text" name="sem" value="" required placeholder="Semester"/></td>
                                    </tr>
                                    <tr>
                                        <td>Branch</td>
                                        <td><input  type="text" name="branch" value="" required placeholder="Branch"/></td>
                                    </tr>
                        
                                    <tr>
                                        <td>Project Id</td>
                                        <td><input type="text" name="project id" value="" required placeholder="Group ID"/></td>
                                    </tr>
                                    
                                    <tr>
                                        <td>Email Id</td>
                                        <td><input type="email" name="email" value="" required placeholder="Email Id"/></td>
                                    </tr>
                                    <tr>
                                        <td>Password</td>
                                        <td><input type="password" name="password" value="" required placeholder="Set Password"/></td>
                                    </tr>
                                    <tr>
                                        <td>Contact No.</td>
                                        <td><input type="text" name="mobile" value="" pattern="[0-9]{10}" required placeholder="MobileNo."/></td>
                                    </tr>
                                    <tr>
                                        <td><input type="submit" value="submit" name="b1"/></td>
                                    </tr>
                                </tbody>
                            </table>
                        </form>
                    </div>
        
    </body>
</html>
