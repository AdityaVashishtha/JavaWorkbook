<html>
  <head>
    <title>Masonry Layout with Masonry Plugin</title>
    <style>
      * {
        -webkit-box-sizing: border-box;
        -moz-box-sizing: border-box;
        box-sizing: border-box;
      }

      .imgs {
        width: inherit;
        margin-right: 10px;
        max-height: 100px;
      }

      #masonry {
        margin-left: 200px;
        max-width: 700px;
      }

      .item {
        margin: 5px;
        width:  300px;
        height: 150px;
        float: left;
        background: #2296DD;
        border: 2px solid #333;
      }

      .item.thumbnail {
        width:  300px;
        height: 200px;
        background: #cfcfcf
      }

      .item.medium {
        width:  300px;
        height: 250px;
        background: #A6E392
      }

      .item.large {
        width:  300px;
        height: 300px;
        background: #D092E3
      }
    </style>
  </head>
  <body>
    <div id='masonry'>
      <div class="item">

      </div>
      <div class="item">

      </div>
      <div class="item thumbnail">

      </div>
      <div class="item medium">

      </div>
      <div class="item">

      </div>
      <div class="item large">

      </div>
      <div class="item">

      </div>
      <div class="item medium">
        
      </div>
    </div>

    <script src='js/masonry.pkgd.min.js'></script>
    <script>
    var container = document.querySelector('#masonry');
    var masonry = new Masonry(container, {
      columnWidth: 25,
      itemSelector: '.item',
      rowHeight: 50
    });
    </script>
  </body>
</html>
