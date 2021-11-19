<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Available Trains</title>
    <style>
           
            table {
                border-collapse: collapse;
            }
            th {
                background-color:green;
                Color:white;
            }
            th, td {
                width:150px;
                text-align:center;
                border:1px solid black;
                padding:5px

            }
            .geeks {
                border-right:hidden;
            }
            .gfg {
                border-collapse:separate;
                border-spacing:0 15px;
            }
            h1 {
                color:green;
            }
        </style>
</head>
<body>
<center>
    <h1>Indian Railways</h1>
    <h2>Availabe Trains</h2>
    <table>
        <tr>
            <th>Train_No</th>
            <th>Train Name</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Ticket_Price</th>
        </tr>
    </table>
    <table class = "gfg">
        <tr>
            <td class = "geeks">1001</td>
            <td>Shatabadi Express</td>
            <td>Bangalore</td>
            <td>Delhi</td>
            <td>2500.00</td>
        </tr>
        <tr>
            <td class = "geeks">1002</td>
            <td>Shatabadi Express</td>
            <td>Delhi</td>
            <td>Bangalore</td>
            <td>2500.00</td>
        </tr>
        <tr>
            <td class = "geeks">1003</td>
            <td>Udyan Express</td>
            <td>Bangalore</td>
            <td>Mambai</td>
            <td>1500.00</td>
        </tr>
        <tr>
            <td class = "geeks">1004</td>
            <td>Udyan Express</td>
            <td>Mumbai</td>
            <td>Bangalore</td>
            <td>1500.00</td>
        </tr>
        <tr>
            <td class = "geeks">1005</td>
            <td>Brindavan Express</td>
            <td>Bangalore</td>
            <td>Chennai</td>
            <td>1000.00</td>
        </tr>
        <tr>
            <td class = "geeks">1006</td>
            <td>Brindavan Express</td>
            <td>Chennai</td>
            <td>Bangalore</td>
            <td>1000.00</td>
        </tr>

    </table>
    <form action="booktrain.jsp">
    <submit><button>Select Train</button></submit>
    </form>

</center>

</body>
</html>