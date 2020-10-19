var objectID = require('mongodb').ObjectID;

module.exports = function (app, db) {

    app.get('/notes/:id', (req, res) => {
        const id = req.params.id
        const details = { '_id': new objectID(id) };
        db.collection('notes').findOne(details, (err, item) => {
            if (err) {
                res.send({ 'error': 'An error has occured' });
            } else {
                res.send(item)
            }
        })
    })

    app.delete('/notes/:id', (req, res) => {
        const id = req.params.id
        const details = { '_id': new objectID(id) };
        db.collection('notes').deleteOne(details, (err, item) => {
            if (err) {
                res.send({ 'error': 'An error has occured' });
            } else {
                res.send(`Note ${id} deleted!`)
            }
        })
    })


    app.put('/notes/:id', (req, res) => {
        const id = req.params.id
        const details = { '_id': new objectID(id) };
        const note = { text: req.body.body, title: req.body.title };
        db.collection('notes').updateOne(details, note, (err, item) => {
            if (err) {
                res.send({ 'error': 'An error has occured' });
            } else {
                res.send(item)
            }
        })
    })


    app.post('/notes', (req, res) => {
        const note = { text: req.body.body, title: req.body.title };
        db.collection('notes').insertOne(note, (err, result) => {
            if (err) {
                res.send({ 'error': "An error has occured" });
            } else {
                res.send(result.ops[0])
            }
        })
    })
}


