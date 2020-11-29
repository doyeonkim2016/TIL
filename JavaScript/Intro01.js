/* JavaScript can change HTML content

One of many Javascript HTML methods is getElementById();

The example below "finds" an HTML element (with id="demo"), and changes the element content (innerHTML) to "Hello JavaScript":

*/
document.getElementById("demo").innerHTML ="Hello JavaScript";


//<Script> Tag
//In HTML, Javascript code is inserted between <script> and </script> tags.

<script>
document.getElementById("Demo").innerHTML= "My First Javascript";
</script>

//JavaScript Display Possibilities
//1. Javascript can display data in different ways:


//a. Writing into an HTML element, using innerHTML.
//To acces an HTML element, JS can use the document.getElementById(id) method. The id attribute defines the HTML element. The inner HTML property defines the HTML content.

//b. Writing into the HTML output using document.write()
//c. Writing into an alert box, suing window.alert().
//d. Writing into the browser console, using console.log()
