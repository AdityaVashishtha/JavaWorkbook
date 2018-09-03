var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);

app.get('/', function(req, res){
  res.sendfile('index.html');
});


io.on('connection', function(socket){
  //console.log('a user connected');
  socket.on('typing status', function(ec){
    io.emit('typing status', ec);
  });
  socket.on('chat message', function(msg){
    io.emit('chat message', msg);
  });
  socket.on('private message', function (from, msg) {
     io.emit('private message', from,  msg);
   });
});

http.listen(3000, function(){
  console.log('listening on *:3000');
});

/*
app.get('/', function(req, res){
  res.send('<h1>Hello world</h1>');
});
*/

app.get('/', function(req, res){
  res.sendFile(__dirname + '/index.html');
});


http.listen(3000, function(){
  console.log('listening on *:3000');
});
