function spin() {
    const bet = document.getElementById("bet").value;

    fetch("spin", {
        method: "POST",
        headers: {"Content-Type": "application/x-www-form-urlencoded"},
        body: "bet=" + bet
    })
    .then(r => r.json())
    .then(data => {
        document.getElementById("reels").innerHTML =
            data.r1 + " " + data.r2 + " " + data.r3;

        document.getElementById("win").innerHTML =
            "Win: " + data.win + " €";
    });
}
