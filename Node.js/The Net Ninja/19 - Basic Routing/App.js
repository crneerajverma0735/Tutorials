var http = require('http');
var fs = require('fs');

var server = http.createServer(function (req, res) {
    console.log('request was made: ' + req.url);
    if (req.url === '/home' || req.url === '/') {
        res.writeHead(200, { 'content-type': 'text/html' });
        fs.createReadStream(__dirname + "/index.html", 'utf-8').pipe(res);
    } else if (req.url === '/contact') {
        res.writeHead(200, { 'content-type': 'text/html' });
        fs.createReadStream(__dirname + "/contact.html", 'utf-8').pipe(res);
    } else if (req.url === '/api/frontend') {
        res.writeHead(200, { 'content-type': 'application/json' });
        var frontend = [{ name: "Neeraj", job: "Reactjs developer" },
        { name: "Rajesh", job: "vuejs developer" },
        { name: "Rahul", job: "Angularjs developer" }];

        res.end(JSON.stringify(frontend));
    } else {
        res.writeHead(200, { 'content-type': 'text/html' });
        fs.createReadStream(__dirname + "/404.html", 'utf-8').pipe(res);
    }
});


server.listen(3000, '127.0.0.1');
console.log("yo dogs, now listening to port 3000");

