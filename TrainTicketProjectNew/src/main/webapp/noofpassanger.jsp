<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Passenger Details</title>

    <style>
    </style>
</head>
<body>
<script type="text/javascript">
    function passanger(){
        var num=document.getElementById("number").value;
        var val=document.getElementById("value");
        while(val.hasChildNodes()){
            val.removeChild(val.lastChild);
        }
        for(var i=0;i<num;i++){
            val.appendChild(document.createTextNode("Name"));
            var input = document.createElement("input");
            input.type="text";
            input.name="names"+i;    //name0     //name1     //name2  //value=name
            input.required=true;
            val.appendChild(input);
            val.appendChild(document.createTextNode("\tAge"));
            var input1 = document.createElement("input");
            input1.type="number";
            input1.name="age"+i;
            input1.required=true;
            val.appendChild(input1);
            val.appendChild(document.createTextNode("\tGender"));
            var input2 = document.createElement("input");
            input2.type="radio";
            input2.name="gender"+i;
            input2.value="Male";
            input2.required=true;
            val.appendChild(input2);
            val.appendChild(document.createTextNode("Male"));
            //val.appendChild(document.createTextNode("Gender"));
            var input2 = document.createElement("input");
            input2.type="radio";
            input2.name="gender"+i;
            input2.value="Female";
            input2.required=true;
            val.appendChild(input2);
            val.appendChild(document.createTextNode("Female"));
           val.appendChild(document.createElement("br"));
        }
    }
</script>
<center>

    <h2>Passenger Details</h2>
    <div>
        Enter No of Passangers
        <input type="number" id="number"><br>
        <br>
        <a href="#" id="passanger" onclick = "passanger()">Fill details</a>
        <div style="font-size:20px;" id="value"/>
    </div>
    <div>
        <a href="GeneratedTicket.jsp"><input type="submit" value="Generate Ticket"></a>
    </div>



    <!--        <table border="0px">-->

    <!--            <tr>-->
    <!--                <td>Enter number of passengers:</td>-->
    <!--                <td><input type="text"></td>-->

    <!--            </tr>-->
    <!--            <tr>-->
    <!--                <td>Name: </td>-->
    <!--                <td><input type="text">&nbsp;</td>-->
    <!--            </tr>-->
    <!--            <tr>-->

    <!--                <td>Age:</td>-->
    <!--                <td><input type="number"></td>-->

    <!--            </tr>-->

    <!--            <tr>-->
    <!--                <td>Gender:</td>-->
    <!--                <td>-->
    <!--                    <input type = "radio" value="Gender">Male-->
    <!--                    <input type = "radio" value="Gender">Female-->
    <!--                </td>-->
    <!--            </tr>-->

    <!--&lt;!&ndash;        </table>&ndash;&gt;<br><br>-->
    <!--        <button type = "submit" style="background-color:green" >Next</button><br>-->
    <!--        <button type = "submit" style="background-color:#f1f1f1">clear</button>-->
    <!--  <div>
          <input type="submit" value="Generate Ticket">
      </div>-->
</center>
</body>
</html>