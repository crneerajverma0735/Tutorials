var mongodb = require('mongodb');

var MongoClient = mongodb.MongoClient;

var url = 'mongodb://localhost:27017/';

MongoClient.connect(url, function (err, db) {
    if (err) {
        console.log(err)
    } else {
        console.log('Connected to', url);
        var dbo = db.db("fruits");
        var collection = dbo.collection('apples');
        var doc1 = { name: 'red apples', color: 'red' };
        var doc2 = { name: 'green apples', color: 'green' };

        collection.insertMany([doc1, doc2], function (err, res) {
            if (err) {
                console.log(err);
            } else {
                console.log("%d docs inserted", res.insertedCount);
            }
            db.close();
        })

    }
});
