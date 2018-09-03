/*
var fs = require('fs')

fs.readFile('package.json', function(err, buf){
    console.log(buf.toString());
});
*/
var http = require('http');

var server = http.createServer(function (request, response){
    response.writeHead(200, { "Content-Type": "text/plain" });
    response.end("DONE IT AGAIN!!");
});

server.listen(7020);

