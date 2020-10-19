const express = require('express');
const path = require('path');
const joi = require('joi');
const bodyParser = require('body-parser');
const app = express();

app.use('/public', express.static(path.join(__dirname, 'static')))
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());


app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'static', 'index.html'));
});

app.post('/', (req, res) => {
    console.log(req.body);
    const schema = joi.object().keys({
        email: joi.string().trim().email().required(),
        pwd: joi.string().min(5).max(10).required()
    });

    joi.validate(req.body, schema, (err, result) => {
        if (err) {
            console.log(err);
            res.send('an error has occurred');
        }
        console.log(result);
        res.send('successfully posted data');

    })
    // database work here
    res.send('successFully posted data')
});


app.listen(3000);

