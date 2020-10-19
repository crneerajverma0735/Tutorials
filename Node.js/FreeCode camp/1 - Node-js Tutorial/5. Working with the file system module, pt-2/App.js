const fs = require('fs');

// fs.mkdir('tutorial', (err) => {
//     if (err) {
//         console.log(err);
//     } else {
//         console.log('folder successfully created');
//     }
// })



// fs.mkdir('tutorial', (err) => {
//     if (err) {
//         console.log(err);
//     } else {
//         fs.rmdir('tutorial', (err) => {
//             if (err) {
//                 console.log(err);
//             } else {
//                 console.log('Successfully deleted the folder');
//             }
//         })
//     }
// });




// fs.mkdir('tutorial', (err) => {
//     if (err) {
//         console.log(err);
//     } else {
//         fs.writeFile('./tutorial/example.txt', '123', (err) => {
//             if (err)
//                 console.log(err);
//             else
//                 console.log('Successfully created file');
//         })
//     }
// });



// fs.unlink('./tutorial/example.txt', (err) => {
//     if (err)
//         console.log(err);
//     else {
//         fs.rmdir('tutorial', (err) => {
//             if (err)
//                 console.log(err);
//             else
//                 console.log('folder has been deleted');
//         });
//     }
// });




fs.readdir('tutorial', (err, files) => {
    if (err) {
        console.log(err);
    } else {
        console.log(files);
        for (let file of files) {
            fs.unlink('./tutorial/' + file, (err) => {
                if (err)
                    console.log(err);
                else {
                    console.log("Successfully deleted file");
                }
            })
        }
    }
});


