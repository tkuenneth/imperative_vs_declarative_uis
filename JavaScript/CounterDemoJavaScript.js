let counter = 0;

updateText();

function handleButtonClicked() {
    updateText(++counter);
}

function updateText() {
    if (counter == 0) {
        document.getElementById("counter").innerHTML = "<h3>Noch nicht geklickt</h3>";
    }
    else {
        document.getElementById("counter").innerHTML = `<h1>${counter}</h1>`;
    }
}