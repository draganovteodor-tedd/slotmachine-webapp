<!DOCTYPE html>
<html>
<head>
    <title>Slot Machine Web</title>
    <script src="static/slot.js"></script>
</head>
<body style="font-family:sans-serif;text-align:center;margin-top:40px;">
    <h1>Web Slot Machine 🕹️</h1>

    <div id="reels" style="font-size:60px;">
        ❓ ❓ ❓
    </div>

    <br/>

    <label>Bet:</label>
    <input id="bet" type="number" value="1" step="0.5" min="0.5"/>

    <br/><br/>

    <button onclick="spin()">SPIN</button>

    <h2 id="win"></h2>

</body>
</html>
