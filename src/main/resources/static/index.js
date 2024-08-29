const url = "http://localhost:8080/customer";
 
function getItems() {
    fetch(url)
    .then((response) => response.json())  // Return the parsed JSON
    .then((data) => console.log(data))
    .catch((error) => console.error("Unable to get items", error));
}