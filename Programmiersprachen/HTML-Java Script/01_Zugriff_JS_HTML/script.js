alert("hello");
function Add()
{
    //Erste Zahl auslesen
    num1 = document.getElementById("number1").value;
    
    //Zweite Zahl auslesen
    num2 = document.getElementById("number2").value;


    let result = parseFloat(num1) + parseFloat(num2);

    document.getElementById("Ergebnis").innerHTML = result;
   


}

function Sub()
{
    //Erste Zahl auslesen
    num1 = document.getElementById("number1").value;
    
    //Zweite Zahl auslesen
    num2 = document.getElementById("number2").value;


    let result = parseFloat(num1) - parseFloat(num2);

    document.getElementById("Ergebnis").innerHTML = result;


}

function Mult()
{
    //Erste Zahl auslesen
    num1 = document.getElementById("number1").value;
    
    //Zweite Zahl auslesen
    num2 = document.getElementById("number2").value;


    let result = parseFloat(num1) * parseFloat(num2);

    document.getElementById("Ergebnis").innerHTML = result;
}

function Div()
{
    //Erste Zahl auslesen
    num1 = document.getElementById("number1").value;
    
    //Zweite Zahl auslesen
    num2 = document.getElementById("number2").value;


    let result = parseFloat(num1) / parseFloat(num2);

    document.getElementById("Ergebnis").innerHTML = result;
}