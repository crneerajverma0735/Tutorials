const express = require('express');
const app = express();

app.get('/', (req, res) => {
    res.send('Hello world');
});

app.get('/example', (req, res) => {
    res.send('hitting example router');
});

app.get('/example/:name/:age', (req, res) => {
    console.log(req.params);
    console.log(req.query);
    res.send(req.params.name + ' : ' + req.params.age);
});

app.listen(3000);


//We enter this url (http://localhost:3000/example/Neeraj/30?tuorial=paramstutorial&sort=byage)
// in url bar