<jsp:useBean id="banking" class="app.Components.BankBean" scope="session" />
<jsp:setProperty name="banking" property="*" />

<html>
    <head>
        <title>Demo</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                color: #333;
                text-align: center;
                padding: 50px;
            }
            h1 {
                color: #4CAF50;
            }
            b {
                font-size: 1.2em;
                color: #555;
            }
        </style>
    </head>
    <body>
        <h1>Welcome ${banking.person}</h1>
        
        <b>Your Interest will be: ${banking.interest}</b><br>
        <b>Total money back will be: ${banking.total}</b>
    
    </body>
</html>
