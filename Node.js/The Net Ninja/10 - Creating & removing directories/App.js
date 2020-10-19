var fs = require('fs');

// fs.unlink("writeMe.txt", () => { });

// fs.mkdirSync('stuff');

// fs.rmdirSync("stuff");

// fs.mkdir("stuff", () => {
//     fs.readFile('readMe.txt', 'utf8', function (err, data) {
//         fs.writeFile('./stuff/writeMe.txt', data, () => { });
//     });
// });


// fs.rmdir('stuff', (err) => { console.log(err) });

fs.unlink('./stuff/writeMe.txt', () => {
    fs.rmdir('stuff', (err) => { console.log(err) });
});